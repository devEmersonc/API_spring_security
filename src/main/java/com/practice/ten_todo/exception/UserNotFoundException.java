package com.practice.ten_todo.exception;

public class UserNotFoundException extends ResourceNotFoundException{

    public UserNotFoundException() {
        super("Usuario no encontrado.");
    }
}
