package ru.itis.antonov.pagesite.validators;

import org.springframework.beans.BeanWrapperImpl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EqualPasswordsValidator implements ConstraintValidator<EqualPasswords, Object> {

    private String passwordField;
    private String passwordRepeatField;

    @Override
    public void initialize(EqualPasswords constraintAnnotation) {
        this.passwordField = constraintAnnotation.passwordField(); // название поля для name -> firstName
        this.passwordRepeatField = constraintAnnotation.passwordRepeatField(); // название поля для surname -> lastName

    }


    @Override
    public boolean isValid(Object value, ConstraintValidatorContext constraintValidatorContext) {
        Object name = new BeanWrapperImpl(value).getPropertyValue(passwordField); //получили конкретные значения
        Object surname = new BeanWrapperImpl(value).getPropertyValue(passwordRepeatField);

        return name != null && name.equals(surname);
    }
}
