package com.yccn.dp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("name","hello pillar");
        return "index";
    }
}
