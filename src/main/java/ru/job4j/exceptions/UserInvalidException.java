package ru.job4j.exceptions;

public class UserInvalidException extends UserNotFoundException {
    public UserInvalidException(String massage) {
        super(massage);
    }
}
