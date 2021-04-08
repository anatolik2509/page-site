package ru.itis.antonov.pagesite.config;

import org.springframework.context.MessageSource;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;
import java.util.Map;

public class StatusView implements View {

    private Locale locale;
    private MessageSource messageSource;
    private int status;

    public StatusView(Locale locale, MessageSource messageSource, int status) {
        this.locale = locale;
        this.messageSource = messageSource;
        this.status = status;
    }

    @Override
    public void render(Map<String, ?> map, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

    }
}
