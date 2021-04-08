package ru.itis.antonov.pagesite.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.security.Principal;

@Aspect
@Component
public class LoggingAspect {

    @Autowired
    private Logger logger;

    @Pointcut("@annotation(ru.itis.antonov.pagesite.aspects.Logging)")
    public void callLogging(){
    }

    @Before("callLogging()")
    public void logMethod(JoinPoint point){
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        logger.info("Called " + point.getSignature() + " method");
        logger.info(principal.toString());
    }
}
