package com.lu.j1993.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2019/8/5.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("content","hi , lucien !");
        return "index";
    }
}
