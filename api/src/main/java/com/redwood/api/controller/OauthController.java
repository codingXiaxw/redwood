package com.redwood.api.controller;

import cn.hutool.crypto.digest.DigestAlgorithm;
import cn.hutool.crypto.digest.Digester;
import com.redwood.api.base.BaseController;
import com.redwood.api.config.RedisSessionConfig;
import com.redwood.core.common.RedwoodResult;
import com.redwood.core.common.impl.SimpleResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.session.Session;
import org.springframework.session.SessionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

@Controller
@RequestMapping("/oauth")
public class OauthController extends BaseController {
    //@Resource
    //private AdminsService adminsService;

    @GetMapping("/login.html")
    public String UserAuthor() {
        return "/login";
    }


    @GetMapping("/logout")
    public String LoginOut() {
        RedisSessionConfig.ClearSession(request);
        return "redirect:/oauth/login";
    }

    @RequestMapping("/status" + requestPathPrifex)
    @ResponseBody
    public RedwoodResult LoginStatus() {
        return SimpleResult.retMessageSuccess("成功", RedisSessionConfig.QuerySession(request));
    }
}
