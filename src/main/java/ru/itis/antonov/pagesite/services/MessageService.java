package ru.itis.antonov.pagesite.services;

import ru.itis.antonov.pagesite.models.Message;

import java.util.List;

public interface MessageService {
    List<Message> messagePage(int page, int pageSize);
}
