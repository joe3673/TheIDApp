package com.Techmotion.appserver.service.model;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Organization {


    private final Long organizationId;

    private String organizationName;

    private String organizationOwnershipName;

    private String organizationType;

    private String organizationLocation;

    private List<Long> upcomingEvents;

    private List<Long> pastEvents;

    private boolean membershipStatus;

    private String languagePreference;

    private boolean receiveNotifications;

    private boolean darkMode;

    private Map<String, Boolean> visibilitySettings;

    private List<String> securityQuestions;

    private boolean twoFactorAuthentication;

    private LocalDateTime membershipExpiryDate;

    private final LocalDateTime organizationCreationDateTime;

    public Organization(Long organizationId, LocalDateTime organizationCreationDateTime) {
        this.organizationId = organizationId;
        this.organizationCreationDateTime = organizationCreationDateTime;
    }

    public Long getOrganizationId() {
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

    public List<Long> getUpcomingEvents() {
        return new LinkedList<>(upcomingEvents);
    }

    public void setUpcomingEvents(List<Long> upcomingEvents) {
        this.upcomingEvents = upcomingEvents;
    }

    public void addUpcomingEvent(Long eventID){
        if(upcomingEvents.size() >= 5 ){
            upcomingEvents.remove(0);
        }
        upcomingEvents.add(eventID);
    }

    public List<Long> getPastEvents() {
        return new LinkedList<>(pastEvents);
    }

    public void setPastEvents(List<Long> pastEvents) {
        this.pastEvents = pastEvents;
    }

    public void addToPastEvents(Long eventID){
        if (pastEvents.size() >=5){
            pastEvents.remove(0);
        }
        pastEvents.add(eventID);
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

    public LocalDateTime getMembershipExpiryDate() {
        return membershipExpiryDate;
    }

    public void setMembershipExpiryDate(LocalDateTime membershipExpiryDate) {
        this.membershipExpiryDate = membershipExpiryDate;
    }

    public LocalDateTime getOrganizationCreationDateTime() {
        return organizationCreationDateTime;
    }
}
