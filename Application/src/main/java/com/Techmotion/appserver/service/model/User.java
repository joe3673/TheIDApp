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

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }

    public BusinessProfile getBusinessProfile() {
        return businessProfile;
    }

    public void setBusinessProfile(BusinessProfile businessProfile) {
        this.businessProfile = businessProfile;
    }

    public ContactInformation getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(ContactInformation contactInformation) {
        this.contactInformation = contactInformation;
    }

    public DatingProfile getDatingProfile() {
        return datingProfile;
    }

    public void setDatingProfile(DatingProfile datingProfile) {
        this.datingProfile = datingProfile;
    }

    public PersonalProfile getPersonalProfile() {
        return personalProfile;
    }

    public void setPersonalProfile(PersonalProfile personalProfile) {
        this.personalProfile = personalProfile;
    }

    public Preferences getPreferences() {
        return preferences;
    }

    public void setPreferences(Preferences preferences) {
        this.preferences = preferences;
    }

    public PrivacySettings getPrivacySettings() {
        return privacySettings;
    }

    public void setPrivacySettings(PrivacySettings privacySettings) {
        this.privacySettings = privacySettings;
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }

    public SubscriptionInfo getSubscriptionInfo() {
        return subscriptionInfo;
    }

    public void setSubscriptionInfo(SubscriptionInfo subscriptionInfo) {
        this.subscriptionInfo = subscriptionInfo;
    }
}
