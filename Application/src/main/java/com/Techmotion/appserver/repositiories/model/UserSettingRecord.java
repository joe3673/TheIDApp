package com.Techmotion.appserver.repositiories.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@DynamoDBTable(tableName = "UserSettings")
public class UserSettingRecord {

    private UUID userID;
    private String languagePreference;

    private boolean receiveNotifications;

    private boolean darkMode;

    private Map<String, Boolean> visibilitySettings;
    private List<Long> blockedUsers;

    private List<String> securityQuestions;

    private boolean twoFactorAuthentication;


    private boolean subscribed;

    private LocalDateTime expiryDate;


    @DynamoDBHashKey(attributeName = "UserId")
    public UUID getUserID() {
        return userID;
    }

    public void setUserID(UUID userID) {
        this.userID = userID;}

    @DynamoDBAttribute(attributeName = "LanguagePreferences")
    public String getLanguagePreference() {
        return languagePreference;
    }

    public void setLanguagePreference(String languagePreference) {
        this.languagePreference = languagePreference;
    }

    @DynamoDBAttribute(attributeName = "Notifications")
    public boolean isReceiveNotifications() {
        return receiveNotifications;
    }

    public void setReceiveNotifications(boolean receiveNotifications) {
        this.receiveNotifications = receiveNotifications;
    }

    @DynamoDBAttribute(attributeName = "DarkMode")
    public boolean isDarkMode() {
        return darkMode;
    }

    public void setDarkMode(boolean darkMode) {
        this.darkMode = darkMode;
    }

    @DynamoDBAttribute(attributeName = "VisibilitySettings")
    public Map<String, Boolean> getVisibilitySettings() {
        return visibilitySettings;
    }

    public void setVisibilitySettings(Map<String, Boolean> visibilitySettings) {
        this.visibilitySettings = visibilitySettings;
    }

    @DynamoDBAttribute(attributeName = "BlockedUsers")
    public List<Long> getBlockedUsers() {
        return blockedUsers;
    }

    public void setBlockedUsers(List<Long> blockedUsers) {
        this.blockedUsers = blockedUsers;
    }

    @DynamoDBAttribute(attributeName = "SecurityQuestions")
    public List<String> getSecurityQuestions() {
        return securityQuestions;
    }

    public void setSecurityQuestions(List<String> securityQuestions) {
        this.securityQuestions = securityQuestions;
    }

    @DynamoDBAttribute(attributeName = "TwoFactorAuthentication")
    public boolean isTwoFactorAuthentication() {
        return twoFactorAuthentication;
    }

    public void setTwoFactorAuthentication(boolean twoFactorAuthentication) {
        this.twoFactorAuthentication = twoFactorAuthentication;
    }

    @DynamoDBAttribute(attributeName = "Subscribed")
    public boolean isSubscribed() {
        return subscribed;
    }

    public void setSubscribed(boolean subscribed) {
        this.subscribed = subscribed;
    }

    @DynamoDBAttribute(attributeName = "ExpiryDate")
    public LocalDateTime getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDateTime expiryDate) {
        this.expiryDate = expiryDate;
    }
}





