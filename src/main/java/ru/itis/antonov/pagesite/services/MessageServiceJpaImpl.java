package ru.itis.antonov.pagesite.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.itis.antonov.pagesite.models.Message;
import ru.itis.antonov.pagesite.repositories.MessageRepository;

import java.util.List;

@Service
public class MessageServiceJpaImpl implements MessageService{

    private MessageRepository messageRepository;

    @Autowired
    public MessageServiceJpaImpl(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    public List<Message> messagePage(int page, int pageSize) {
        PageRequest pageRequest = PageRequest.of(page, pageSize, Sort.by("created"));
        Page<Message> result = messageRepository.findAll(pageRequest);
        return result.toList();
    }
}
