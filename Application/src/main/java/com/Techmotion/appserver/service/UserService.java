package com.Techmotion.appserver.service;

import com.Techmotion.appserver.service.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    private final User user;


    @Autowired
    public UserService(User user) {
        this.user = user;
    }

    public User getUser(){


    }
}
