package ru.itis.antonov.pagesite.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;
import java.util.Map;

public class ExtendedFreemarkerView implements View {

    private Locale locale;
    private MessageSource messageSource;

    public ExtendedFreemarkerView(Locale locale, MessageSource messageSource) {
        this.locale = locale;
        this.messageSource = messageSource;
    }

    @Override
    public void render(Map<String, ?> map, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

    }
}
