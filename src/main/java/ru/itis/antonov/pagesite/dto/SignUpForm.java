package ru.itis.antonov.pagesite.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itis.antonov.pagesite.validators.EqualPasswords;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualPasswords(passwordField = "password", passwordRepeatField = "passwordRepeat")
public class SignUpForm {
    private String login;
    private String password;
    private String passwordRepeat;
}
