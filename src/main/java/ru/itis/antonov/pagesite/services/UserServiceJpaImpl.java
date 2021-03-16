package ru.itis.antonov.pagesite.services;

import org.springframework.beans.factory.annotation.Autowired;
import ru.itis.antonov.pagesite.dto.SignUpForm;
import ru.itis.antonov.pagesite.models.User;
import ru.itis.antonov.pagesite.repositories.UserRepository;

public class UserServiceJpaImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceJpaImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User login(String email, String password) {
        return null;
    }

    @Override
    public User signUp(SignUpForm form) {
        return null;
    }
}
