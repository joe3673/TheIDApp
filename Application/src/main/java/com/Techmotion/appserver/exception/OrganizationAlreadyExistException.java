package com.Techmotion.appserver.exception;

public class OrganizationAlreadyExistException extends RuntimeException {

    public OrganizationAlreadyExistException(String message){
        super(message);
    }
}
