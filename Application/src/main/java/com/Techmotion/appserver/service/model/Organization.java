package com.Techmotion.appserver.service.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Organization {


    private final UUID organizationId;

    private String organizationName;

    private String organizationOwnershipName;

    private String organizationType;

    private String organizationLocation;

    private boolean membershipStatus;

    private String languagePreference;

    private boolean receiveNotifications;

    private boolean darkMode;

    private Map<String, Boolean> visibilitySettings;

    private List<String> securityQuestions;

    private boolean twoFactorAuthentication;


    private boolean subscribed;

    private LocalDateTime expiryDate;

    private final LocalDateTime organizationCreationDateTime;

    public Organization(UUID organizationId, LocalDateTime organizationCreationDateTime) {
        this.organizationId = organizationId;
        this.organizationCreationDateTime = organizationCreationDateTime;
    }

    public UUID getOrganizationId() {
        return organizationId;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationOwnershipName() {
        return organizationOwnershipName;
    }

    public void setOrganizationOwnershipName(String organizationOwnershipName) {
        this.organizationOwnershipName = organizationOwnershipName;
    }

    public String getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(String organizationType) {
        this.organizationType = organizationType;
    }

    public String getOrganizationLocation() {
        return organizationLocation;
    }

    public void setOrganizationLocation(String organizationLocation) {
        this.organizationLocation = organizationLocation;
    }

    public boolean isMembershipStatus() {
        return membershipStatus;
    }

    public void setMembershipStatus(boolean membershipStatus) {
        this.membershipStatus = membershipStatus;
    }

    public String getLanguagePreference() {
        return languagePreference;
    }

    public void setLanguagePreference(String languagePreference) {
        this.languagePreference = languagePreference;
    }

    public boolean isReceiveNotifications() {
        return receiveNotifications;
    }

    public void setReceiveNotifications(boolean receiveNotifications) {
        this.receiveNotifications = receiveNotifications;
    }

    public boolean isDarkMode() {
        return darkMode;
    }

    public void setDarkMode(boolean darkMode) {
        this.darkMode = darkMode;
    }

    public Map<String, Boolean> getVisibilitySettings() {
        return visibilitySettings;
    }

    public void setVisibilitySettings(Map<String, Boolean> visibilitySettings) {
        this.visibilitySettings = visibilitySettings;
    }

    public List<String> getSecurityQuestions() {
        return securityQuestions;
    }

    public void setSecurityQuestions(List<String> securityQuestions) {
        this.securityQuestions = securityQuestions;
    }

    public boolean isTwoFactorAuthentication() {
        return twoFactorAuthentication;
    }

    public void setTwoFactorAuthentication(boolean twoFactorAuthentication) {
        this.twoFactorAuthentication = twoFactorAuthentication;
    }

    public boolean isSubscribed() {
        return subscribed;
    }

    public void setSubscribed(boolean subscribed) {
        this.subscribed = subscribed;
    }

    public LocalDateTime getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDateTime expiryDate) {
        this.expiryDate = expiryDate;
    }

    public LocalDateTime getOrganizationCreationDateTime() {
        return organizationCreationDateTime;
    }
}
