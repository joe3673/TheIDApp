package com.Techmotion.appserver.exception;

public class UserAlreadyExistException extends RuntimeException {

    public UserAlreadyExistException(String message){
        super(message);
    }
}

