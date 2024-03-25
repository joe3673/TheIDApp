package com.Techmotion.appserver.service.model;

public class User {

    private final String userId;

    private final String userName;

    private final String password;

    private final String email;

    private final String firstName;

    private final String lastName;

    private String occupation;




    public User(String userId, String userName, String password, String email, String firstName, String lastName) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
