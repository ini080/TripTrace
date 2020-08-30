package com.jgds.triptrace.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @RequestMapping(value= "/loginPage")
    public String loginPage(Model model){
        return "/Login/loginPage";
    }

    @ResponseBody
    @RequestMapping(value= "/login", method = RequestMethod.POST)
    public String loginTry(HttpServletRequest request, HttpSession session ) throws  Exception{
        System.out.println("에이작스호출");
        String email = request.getParameter("loginEmail");
        String pw = request.getParameter("loginPw");
        System.out.println(email + " " + pw);
        return "이게응답이네요";
    }
}
