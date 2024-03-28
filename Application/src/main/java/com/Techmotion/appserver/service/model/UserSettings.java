package com.Techmotion.appserver.service.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class UserSettings {

    private String languagePreference;

    private boolean receiveNotifications;

    private boolean darkMode;

    private Map<String, Boolean> visibilitySettings;
    private List<String> blockedUsers;

    private List<String> securityQuestions;

    private boolean twoFactorAuthentication;


    private boolean subscribed;

    private LocalDateTime expiryDate;
}
