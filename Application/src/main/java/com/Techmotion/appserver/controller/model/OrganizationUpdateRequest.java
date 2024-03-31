package com.Techmotion.appserver.controller.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class OrganizationUpdateRequest {

    @JsonProperty("organizationName")
    private String organizationName;

    @JsonProperty("organizationOwnershipName")
    private String organizationOwnershipName;

    @JsonProperty("organizationType")
    private String organizationType;

    @JsonProperty("organizationLocation")
    private String organizationLocation;

    @JsonProperty("membershipStatus")
    private boolean membershipStatus;

    @JsonProperty("languagePreferences")
    private String languagePreference;

    @JsonProperty("receiveNotifications")
    private boolean receiveNotifications;

    @JsonProperty("darkMode")
    private boolean darkMode;

    @JsonProperty("visibilitySettings")
    private Map<String, Boolean> visibilitySettings;

    @JsonProperty("securityQuestions")
    private List<String> securityQuestions;

    @JsonProperty("twoFactorAuthentication")
    private boolean twoFactorAuthentication;


    @JsonProperty("subscribed")
    private boolean subscribed;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @JsonProperty("expiryDate")
    private LocalDateTime expiryDate;





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


}
