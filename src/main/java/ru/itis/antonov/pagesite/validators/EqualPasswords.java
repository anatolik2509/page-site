package ru.itis.antonov.pagesite.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = EqualPasswordsValidator.class)
@Target( {ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface EqualPasswords {
    String message() default "Invalid phone number";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    String passwordField();

    String passwordRepeatField();

    @Target({ ElementType.TYPE })
    @Retention(RetentionPolicy.RUNTIME)
    @interface List {
        EqualPasswords[] value();
    }
}
