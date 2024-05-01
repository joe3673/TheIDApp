package com.Techmotion.appserver.repositiories.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;


@DynamoDBTable(tableName = "Users")
public class UserRecord {

    private UUID userId;

    private String userName;

    private String password;

    private String email;

    private String firstName;

    private String lastName;

    private int age;

    private final LocalDateTime creationDate;
    private LocalDateTime lastLoginDate;
    private boolean activeStatus;

    private String phoneNumber;

    private List<UUID> connections;

    //Business Profile
    private String businessProfileName;

    private String careerType;

    private String occupation;

    private int tenure;

    private String skills;

    private String businessProfileBio;

    //DatingInfo
    private String datingProfileName;

    private String datingProfileBio;

    private double height;

    //Personal Info
    private String personalProfileName;

    private String personalProfileBio;

    private LocalDateTime birthday;

    private String hometown;

    //Settings
    private UUID settingsId;

    //Events
    private List<Long> events;

    public UserRecord(UUID userId, String userName, String password, String email, String firstName, String lastName, int age, LocalDateTime creationDate) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.creationDate = creationDate;
    }


    @DynamoDBHashKey(attributeName = "Id")
    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    @DynamoDBAttribute(attributeName = "UserName")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    @DynamoDBAttribute(attributeName = "Password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @DynamoDBAttribute(attributeName = "Email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @DynamoDBAttribute(attributeName = "FirstName")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @DynamoDBAttribute(attributeName = "Lastname")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @DynamoDBAttribute(attributeName = "Age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @DynamoDBAttribute(attributeName = "CreationDate")
    public LocalDateTime getCreationDate() {
        return creationDate;
    }


    @DynamoDBAttribute(attributeName = "LastLoginDate")
    public LocalDateTime getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(LocalDateTime lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    @DynamoDBAttribute(attributeName = "ActiveStatus")
    public boolean isActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(boolean activeStatus) {
        this.activeStatus = activeStatus;
    }

    @DynamoDBAttribute(attributeName = "PhoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @DynamoDBAttribute(attributeName = "Connections")
    public List<UUID> getConnections() {
        return connections;
    }

    public void setConnections(List<UUID> connections) {
        this.connections = connections;
    }

    @DynamoDBAttribute(attributeName = "BusinessProfileName")
    public String getBusinessProfileName() {
        return businessProfileName;
    }

    public void setBusinessProfileName(String businessProfileName) {
        this.businessProfileName = businessProfileName;
    }

    @DynamoDBAttribute(attributeName = "CareerType")
    public String getCareerType() {
        return careerType;
    }

    public void setCareerType(String careerType) {
        this.careerType = careerType;
    }

    @DynamoDBAttribute(attributeName = "Occupation")
    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @DynamoDBAttribute(attributeName = "Tenure")
    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    @DynamoDBAttribute(attributeName = "Skills")
    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    @DynamoDBAttribute(attributeName = "ProfileBio")
    public String getBusinessProfileBio() {
        return businessProfileBio;
    }

    public void setBusinessProfileBio(String businessProfileBio) {
        this.businessProfileBio = businessProfileBio;
    }

    @DynamoDBAttribute(attributeName = "DatingProfileName")
    public String getDatingProfileName() {
        return datingProfileName;
    }

    public void setDatingProfileName(String datingProfileName) {
        this.datingProfileName = datingProfileName;
    }

    @DynamoDBAttribute(attributeName = "DatingProfileBio")
    public String getDatingProfileBio() {
        return datingProfileBio;
    }

    public void setDatingProfileBio(String datingProfileBio) {
        this.datingProfileBio = datingProfileBio;
    }

    @DynamoDBAttribute(attributeName = "Height")
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @DynamoDBAttribute(attributeName = "PersonalProfileName")
    public String getPersonalProfileName() {
        return personalProfileName;
    }

    public void setPersonalProfileName(String personalProfileName) {
        this.personalProfileName = personalProfileName;
    }

    @DynamoDBAttribute(attributeName = "PersonalProfileBio")
    public String getPersonalProfileBio() {
        return personalProfileBio;
    }

    public void setPersonalProfileBio(String personalProfileBio) {
        this.personalProfileBio = personalProfileBio;
    }

    @DynamoDBAttribute(attributeName = "Birthday")
    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    @DynamoDBAttribute(attributeName = "Hometown")
    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    @DynamoDBAttribute(attributeName = "Settings")
    public UUID getSettingsId() {
        return settingsId;
    }

    public void setSettingsId(UUID settingsId) {
        this.settingsId = settingsId;
    }

    @DynamoDBAttribute(attributeName = "EventList")
    public List<Long> getEvents(){return events;}

    public void setEvents(List<Long> events){
        this.events = events;
    }
}
