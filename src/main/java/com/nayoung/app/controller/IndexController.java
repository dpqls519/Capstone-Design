package com.nayoung.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/menu")
    public String index() {
        return "menu";
    }
}
