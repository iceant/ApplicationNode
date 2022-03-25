package com.github.iceant.application.node.console.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewController {
    @RequestMapping(path = {"", "/", "/index", "/index.htm"})
    public ModelAndView index(){
        return new ModelAndView("index.html");
    }
}
