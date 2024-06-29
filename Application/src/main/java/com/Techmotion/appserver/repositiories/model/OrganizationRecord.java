package com.Techmotion.appserver.repositiories.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@DynamoDBTable(tableName = "Organizations")
public class OrganizationRecord {

    private Long organizationId;

    private String organizationName;

    private String organizationOwnershipName;

    private String organizationType;

    private String organizationLocation;

    private boolean membershipStatus;

    private List<Long> upcomingEvents;

    private List<Long> pastEvents;

    private String languagePreference;

    private boolean receiveNotifications;

    private boolean darkMode;


    private Map<String, Boolean> visibilitySettings;

    private List<String> securityQuestions;

    private boolean twoFactorAuthentication;

    private LocalDateTime membershipExpiryDate;

    private LocalDateTime organizationCreationDateTime;



    @DynamoDBHashKey(attributeName = "OrganizationId")
    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId){
        this.organizationId = organizationId;
    }

    @DynamoDBAttribute(attributeName = "OrganizationName")
    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    @DynamoDBAttribute(attributeName = "OrganizationOwnerShipName")
    public String getOrganizationOwnershipName() {
        return organizationOwnershipName;
    }

    public void setOrganizationOwnershipName(String organizationOwnershipName) {
        this.organizationOwnershipName = organizationOwnershipName;
    }

    @DynamoDBAttribute(attributeName = "OrganizationType")
    public String getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(String organizationType) {
        this.organizationType = organizationType;
    }

    @DynamoDBAttribute(attributeName = "OrganizationLocation")
    public String getOrganizationLocation() {
        return organizationLocation;
    }

    public void setOrganizationLocation(String organizationLocation) {
        this.organizationLocation = organizationLocation;
    }

    @DynamoDBAttribute(attributeName = "MembershipStatus")
    public boolean isMembershipStatus() {
        return membershipStatus;
    }

    public void setMembershipStatus(boolean membershipStatus) {
        this.membershipStatus = membershipStatus;
    }

    @DynamoDBAttribute(attributeName = "UpcomingEvents")
    public List<Long> getUpcomingEvents() {
        return upcomingEvents;
    }

    public void setUpcomingEvents(List<Long> upcomingEvents) {
        this.upcomingEvents = upcomingEvents;
    }

    @DynamoDBAttribute(attributeName = "pastEvents")
    public List<Long> getPastEvents() {
        return pastEvents;
    }

    public void setPastEvents(List<Long> pastEvents) {
        this.pastEvents = pastEvents;
    }

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

    @DynamoDBAttribute(attributeName = "ExpiryDate")
    public LocalDateTime getMembershipExpiryDate() {
        return membershipExpiryDate;
    }

    public void setMembershipExpiryDate(LocalDateTime membershipExpiryDate) {
        this.membershipExpiryDate = membershipExpiryDate;
    }

    @DynamoDBAttribute(attributeName = "OrganizationCreationDate")
    public LocalDateTime getOrganizationCreationDateTime() {
        return organizationCreationDateTime;
    }

    public void setOrganizationCreationDateTime(LocalDateTime creationDateTime){
        this.organizationCreationDateTime = creationDateTime;
    }

}
