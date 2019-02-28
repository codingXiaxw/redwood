package com.redwood.api.controller;

import com.redwood.api.base.BaseController;
import com.redwood.api.config.RedisSessionConfig;
import com.redwood.core.common.RedwoodResult;
import com.redwood.core.common.impl.SimpleResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
        return SimpleResult.retMessageSuccess("看你地巴巴看", RedisSessionConfig.QuerySession(request));
    }
}
