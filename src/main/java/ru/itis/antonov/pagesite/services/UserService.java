package ru.itis.antonov.pagesite.services;

import ru.itis.antonov.pagesite.dto.SignUpForm;
import ru.itis.antonov.pagesite.models.User;

public interface UserService {
    User login(String email, String password);

    User signUp(SignUpForm form);
}
