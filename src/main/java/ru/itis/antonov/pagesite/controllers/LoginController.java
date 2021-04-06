package ru.itis.antonov.pagesite.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @PreAuthorize("permitAll()")
    @GetMapping("/login")
    public String getView(){
        return "signIn";
    }
}
