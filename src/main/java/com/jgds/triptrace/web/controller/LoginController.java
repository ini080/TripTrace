package com.jgds.triptrace.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping(value= "/loginPage")
    public String loginPage(Model model){
        System.out.println("여기?");
        model.addAttribute("name","DASOM");
        return "/Login/loginPage";
    }
}
