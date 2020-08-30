package com.jgds.triptrace.web;

import com.jgds.triptrace.web.dto.LoginDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/loginPage")
    public String loginPage(){
        return "loginPage";
    }


}
