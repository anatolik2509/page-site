package ru.itis.antonov.pagesite.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ru.itis.antonov.pagesite.aspects.Logging;

@Controller
public class LoginController {

    @PreAuthorize("permitAll()")
    @GetMapping("/login")
    @Logging
    public String getView(){
        Logger logger = LoggerFactory.getLogger(LoginController.class);
        logger.info("ok");
        return "signIn";
    }
}
