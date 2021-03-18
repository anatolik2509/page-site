package ru.itis.antonov.pagesite.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.antonov.pagesite.dto.SignUpForm;
import ru.itis.antonov.pagesite.exceptions.LoginOccupiedException;
import ru.itis.antonov.pagesite.exceptions.NoSuchUserException;
import ru.itis.antonov.pagesite.exceptions.PasswordMismatchException;
import ru.itis.antonov.pagesite.models.User;
import ru.itis.antonov.pagesite.repositories.UserRepository;

import java.util.Optional;

@Service
@Slf4j
public class UserServiceJpaImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceJpaImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User login(String login, String password) {
        Optional<User> userOpt = userRepository.findByLogin(login);
        if(!userOpt.isPresent()){
            throw new NoSuchUserException();
        }
        User user = userOpt.get();
        if(!user.getPassword().equals(password)){
            throw new PasswordMismatchException();
        }
        return user;
    }

    @Override
    public User signUp(SignUpForm form) {
        if(userRepository.existsUserByLogin(form.getLogin())){
            throw new LoginOccupiedException(form.getLogin() + " is occupied");
        }
        User newUser = User.builder().login(form.getLogin()).password(form.getPassword()).build();
        userRepository.save(newUser);
        return newUser;
    }
}
