package ru.itis.antonov.pagesite.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.AbstractTemplateViewResolver;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

import java.util.Locale;

@Component
public class ExtendedFreemarkerViewResolver extends UrlBasedViewResolver {

    private MessageSource messageSource;

    @Autowired(required = false)
    public ExtendedFreemarkerViewResolver(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @Override
    public View resolveViewName(String viewName, Locale locale) throws Exception {
        if(viewName.startsWith("redirect:")){
            return new RedirectView(viewName.substring("redirect:".length()), true);
        }
        if(viewName.startsWith("status:")){
            return new StatusView(locale, messageSource, Integer.parseInt(viewName.substring("status:".length())));
        }
        return new ExtendedFreemarkerView(locale, messageSource);
    }
}
