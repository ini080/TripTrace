package com.jgds.triptrace.web;

import com.jgds.triptrace.web.dto.LoginDto;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/index.do")
    public String loginPage(Model model){
        model.addAttribute("테스트중ㅇ ~~");
        return "loginPage";
    }


}
