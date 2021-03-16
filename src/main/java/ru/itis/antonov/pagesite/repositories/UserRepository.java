package ru.itis.antonov.pagesite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.antonov.pagesite.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
