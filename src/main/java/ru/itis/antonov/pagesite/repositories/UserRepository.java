package ru.itis.antonov.pagesite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.antonov.pagesite.models.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsUserByLogin(String login);

    Optional<User> findByLogin(String login);

}
