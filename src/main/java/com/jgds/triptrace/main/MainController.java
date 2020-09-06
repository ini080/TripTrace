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

    @RequestMapping(value= "/Main/home.do")
    public String mainHome(Model model){
        return "/Main/mainPage";
    }

    @RequestMapping(value= "/Main/About.do")
    public String mainAbout(Model model){
        return "/Main/about";
    }

    @RequestMapping(value= "/Main/Contatct.do")
    public String mainContatct(Model model){
        return "/Main/contact";
    }

    @RequestMapping(value= "/Main/Gallery.do")
    public String mainGallery(Model model){
        return "/Main/gallery";
    }

    @RequestMapping(value= "/Main/Pricing.do")
    public String mainPricing(Model model){
        return "/Main/pricing";
    }

    @RequestMapping(value= "/Main/Single.do")
    public String mainSinglet(Model model){
        return "/Main/single";
    }

}
