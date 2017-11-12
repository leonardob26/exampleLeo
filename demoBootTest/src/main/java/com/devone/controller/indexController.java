package com.devone.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@EnableAutoConfiguration
public class indexController {

    @RequestMapping("/")
    @ResponseBody
    ModelAndView index() {
        return new ModelAndView("index");
    }
}