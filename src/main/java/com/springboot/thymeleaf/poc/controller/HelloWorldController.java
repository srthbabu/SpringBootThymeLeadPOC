package com.springboot.thymeleaf.poc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("message" , "HelloWorldController");
        return "index";
    }

}
