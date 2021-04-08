package ru.itis.antonov.pagesite.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class MessagesController {

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/forum")
    public String getView(Principal principal){
        return "messages";
    }
}
