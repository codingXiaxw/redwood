package com.redwood.api.controller;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONObject;
import com.redwood.api.base.BaseController;
import com.redwood.api.config.RedisSessionConfig;
import com.redwood.core.common.RedwoodResult;
import com.redwood.core.common.impl.SimpleResult;
import com.redwood.core.utils.AesCbcUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/api/v1/oauth")
public class OauthController extends BaseController {
    //@Resource
    //private AdminsService adminsService;

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
        String reqesutUrl = "https://api.weixin.qq.com/sns/jscode2session?" + params;
        String requestResult = HttpUtil.get(reqesutUrl);
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
            var map = new HashMap<>();

            JSONObject userInfoJSON = new JSONObject(result);
            Map userInfo = new HashMap();
            userInfo.put("openId", openid);
            userInfo.put("nickName", userInfoJSON.get("nickName"));
            userInfo.put("gender", userInfoJSON.get("gender"));
            userInfo.put("city", userInfoJSON.get("city"));
            userInfo.put("province", userInfoJSON.get("province"));
            userInfo.put("country", userInfoJSON.get("country"));
            userInfo.put("avatarUrl", userInfoJSON.get("avatarUrl"));
            // 解密unionId & openId;
            if (!userInfoJSON.isNull("unionId")) {
                userInfo.put("unionId", userInfoJSON.get("unionId"));
            }
            map.put("userInfo", userInfo);

            return SimpleResult.retMessageSuccess("登录成功", map);
        } else {
            return SimpleResult.retMessageFail("解密失败");
        }
    }


    @RequestMapping("/status" + requestPathPrifex)
    @ResponseBody
    public RedwoodResult LoginStatus() {
        return SimpleResult.retMessageSuccess("看你地巴巴看", RedisSessionConfig.QuerySession(request));
    }
}
