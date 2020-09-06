package com.jgds.triptrace.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping(value= "/loginSuccess.do")
    public String loginSuccess(Model model){
        return "/Main/mainPage";
    }

    @RequestMapping(value= "/Main/About.do")
    public String mainAbout(Model model){
        return "/Main/about";
    }

}
