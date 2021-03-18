package ru.itis.antonov.pagesite.exceptions;

public class LoginOccupiedException extends RuntimeException{
    public LoginOccupiedException() {
    }

    public LoginOccupiedException(String message) {
        super(message);
    }

    public LoginOccupiedException(String message, Throwable cause) {
        super(message, cause);
    }

    public LoginOccupiedException(Throwable cause) {
        super(cause);
    }
}
