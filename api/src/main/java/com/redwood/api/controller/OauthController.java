package com.redwood.api.controller;

import cn.hutool.json.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.redwood.api.base.BaseController;
import com.redwood.api.config.RedisSessionConfig;
import com.redwood.core.common.RedwoodException;
import com.redwood.core.common.RedwoodResult;
import com.redwood.core.common.impl.SimpleResult;
import com.redwood.core.entity.CoreUser;
import com.redwood.core.service.CoreUserService;
import com.redwood.core.utils.AesCbcUtil;
import com.redwood.core.utils.RDHttpUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;

@Controller
@RequestMapping("/api/v1/oauth")
public class OauthController extends BaseController {
    @Resource
    private CoreUserService coreUserService;
    @Resource
    private RedisSessionConfig redisSessionConfig;

    private String wxspAppid = "wxc38feb79ab8cfbf2";
    private String wxspSecret = "916137c28b6db8eb6f98e79aa76ae58b";

    @RequestMapping("/user_login")
    @ResponseBody
    public RedwoodResult WxUserLogin() {

        var encryptedData = this.getParamStr("encryptedData");
        var iv = this.getParamStr("iv");
        var code = this.getParamStr("code");

        // 登录凭证不能为空
        if (code == null || code.length() == 0) {
            return SimpleResult.retMessageFail("code 不能为空");
        }

        // 授权（必填）
        String grant_type = "authorization_code";

        //////////////// 1、向微信服务器 使用登录凭证 code 获取 session_key 和 openid
        // 请求参数
        String params = "appid=" + wxspAppid + "&secret=" + wxspSecret + "&js_code=" + code + "&grant_type="
                + grant_type;
        // 发送请求
        String reqesutUrl = "https://api.weixin.qq.com/sns/jscode2session";
        String requestResult = RDHttpUtil.sendGet(reqesutUrl, params);
        // 解析相应内容（转换成json对象）
        JSONObject json = new JSONObject(requestResult);
        if (json.get("errcode") != null)
            return SimpleResult.retMessageFail(String.format("微信通信错误，错误信息[%s]", json.get("errmsg")));

        // 获取会话密钥（session_key）
        String session_key = json.get("session_key").toString();
        // 用户的唯一标识（openid）
        String openid = (String) json.get("openid");

        //////////////// 2、对encryptedData加密数据进行AES解密 ////////////////
        String result = AesCbcUtil.decrypt(encryptedData, session_key, iv, "UTF-8");
        if (null != result && result.length() > 0) {
            JSONObject userInfoJSON = new JSONObject(result);
            var coreUser = new CoreUser();
            coreUser.setWxId(openid);
            coreUser.setWxName(userInfoJSON.get("nickName").toString());
            coreUser.setWxHeadUrl(userInfoJSON.get("avatarUrl").toString());
            coreUser.setWxProvince(userInfoJSON.get("province").toString());
            coreUser.setWxCity(userInfoJSON.get("city").toString());
            coreUser.setWxCountry(userInfoJSON.get("country").toString());
            coreUser.setWxGender(Integer.parseInt(userInfoJSON.get("gender").toString()));

            // 解密unionId
            if (!userInfoJSON.isNull("unionId")) {
                coreUser.setWxUnionId(userInfoJSON.get("unionId").toString());
            }

            var saveUserList = new ArrayList<CoreUser>();
            saveUserList.add(coreUser);

            //保存用户信息
            coreUserService.saveOrUpdateBatch(saveUserList, 0);
            var userResult = coreUserService.getOne(new QueryWrapper<CoreUser>().eq("wx_id", coreUser.getWxId()));
            if (userResult == null)
                throw new RedwoodException("系统异常，登录失败");

            //设置用户登录状态
            var token = redisSessionConfig.SaveSession(userResult);
            if (token == null)
                throw new RedwoodException("系统异常，登录失败");

            return SimpleResult.retMessageSuccess("登录成功", token);
        } else {
            return SimpleResult.retMessageFail("解密失败");
        }
    }


    @RequestMapping("/user_status")
    @ResponseBody
    public RedwoodResult LoginStatus() {
        var session = redisSessionConfig.QuerySession();
        if (session == null)
            return SimpleResult.retNeedLogin;

        return SimpleResult.retMessageSuccess("已登录", session);
    }
}
