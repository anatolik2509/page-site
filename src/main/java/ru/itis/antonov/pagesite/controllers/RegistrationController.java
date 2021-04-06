package ru.itis.antonov.pagesite.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itis.antonov.pagesite.dto.SignUpForm;
import ru.itis.antonov.pagesite.exceptions.LoginOccupiedException;
import ru.itis.antonov.pagesite.models.User;
import ru.itis.antonov.pagesite.services.UserService;

import javax.validation.Valid;

@Controller
public class RegistrationController {

    @Autowired
    private UserService userService;

    @PreAuthorize("permitAll()")
    @GetMapping("/register")
    public String getView(){
        return "signUp";
    }

    @PreAuthorize("permitAll()")
    @PostMapping("/register")
    public String registration(@Valid SignUpForm form, BindingResult result, Authentication authentication){
        if(result.hasErrors()){
            return "signUp";
        }
        try {
            userService.signUp(form);
            authentication.setAuthenticated(true);
        }
        catch (LoginOccupiedException e){
            e.printStackTrace();
            return "signUp";
        }
        return "redirect:/forum";
    }

}
