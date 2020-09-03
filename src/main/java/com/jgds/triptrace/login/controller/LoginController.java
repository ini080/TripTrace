package com.jgds.triptrace.login.controller;

import com.jgds.triptrace.login.dao.LoginDAO;
import com.jgds.triptrace.login.service.UserService;
import com.jgds.triptrace.login.vo.UserVO;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

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

        List<UserVO> list = userService.selectUserList();
        for (UserVO userVO : list) {
            System.out.println(userVO.toString());
        }


        return "이게응답이네요";
    }
}
