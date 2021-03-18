package ru.itis.antonov.pagesite.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String getView(){
        return "loginPage";
    }
}
