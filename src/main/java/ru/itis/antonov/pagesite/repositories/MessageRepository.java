package ru.itis.antonov.pagesite.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.itis.antonov.pagesite.models.Message;

public interface MessageRepository extends PagingAndSortingRepository<Message, Long> {
}
