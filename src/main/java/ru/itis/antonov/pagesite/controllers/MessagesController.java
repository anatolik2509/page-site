package ru.itis.antonov.pagesite.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessagesController {

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/forum")
    public String getView(){
        return "messages";
    }
}
