package com.redwood.api.controller;

import com.redwood.api.base.BaseController;
import com.redwood.api.config.RedisSessionConfig;
import com.redwood.core.common.RedwoodResult;
import com.redwood.core.common.impl.SimpleResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/v1/")
public class UserController extends BaseController {
    @RequestMapping("/status" + requestPathPrifex)
    @ResponseBody
    public RedwoodResult LoginStatus() {
        return SimpleResult.retMessageSuccess("成功", RedisSessionConfig.QuerySession(request));
    }
}
