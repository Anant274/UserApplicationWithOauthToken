package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rest")
public class OauthTestController {

    @GetMapping("/welcome")
    public String welcomePage() {
        return "welcome";
    }
}
