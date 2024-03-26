package com.Techmotion.appserver.service.model;

import com.Techmotion.appserver.service.model.UserSubClasses.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

    private final String userId;

    private final String userName;

    private final String password;

    private final String email;

    private final String firstName;

    private final String lastName;

    private final int age;


    @Autowired
    private AccountStatus accountStatus;

    @Autowired
    private BusinessProfile businessProfile;

    @Autowired
    private ContactInformation contactInformation;

    @Autowired
    private DatingProfile datingProfile;

    @Autowired
    private PersonalProfile personalProfile;

    @Autowired
    private Preferences preferences;

    @Autowired
    private  PrivacySettings privacySettings;

    @Autowired
    private Security security;

    @Autowired
    private SubscriptionInfo subscriptionInfo;

















    public User(String userId, String userName, String password, String email, String firstName, String lastName, int age) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
