package com.alianddubbo.controller;

import com.alianddubbo.service.UserService;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Joy
 * @time 2020/8/19 15:18
 */
@RestController
public class UserController {

    @Reference
    private UserService userService;

    @GetMapping("getUser")
    @SentinelResource(value = "getUser", blockHandler = "getUserError")
    public String getUser(@RequestParam("uid") Integer uid) {
        return userService.getName(uid);
    }


    public String getUserError(Integer uid) {
        return "get Error";
    }
}
