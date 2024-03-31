package com.Techmotion.appserver.repositiories.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import java.time.LocalDateTime;
import java.util.List;


@DynamoDBTable(tableName = "Users")
public class UserRecord {

    private long userId;

    private String userName;

    private String password;

    private String email;

    private String firstName;

    private String lastName;

    private int age;

    private LocalDateTime creationDate;
    private LocalDateTime lastLoginDate;
    private boolean activeStatus;

    private String phoneNumber;

    private List<String> socialMediaProfiles;

    private List<String> connections;


    private String businessProfileName;

    private String careerType;

    private String occupation;

    private int tenure;

    private String skills;

    private String businessProfileBio;

    private String datingProfileName;

    private String datingProfileBio;

    private double height;


    private String personalProfileName;

    private String personalProfileBio;

    private LocalDateTime birthday;

    private String hometown;


    @DynamoDBHashKey(attributeName = "Id")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
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

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
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

    @DynamoDBAttribute(attributeName = "SocialMediaProfiles")
    public List<String> getSocialMediaProfiles() {
        return socialMediaProfiles;
    }

    public void setSocialMediaProfiles(List<String> socialMediaProfiles) {
        this.socialMediaProfiles = socialMediaProfiles;
    }

    @DynamoDBAttribute(attributeName = "Connections")
    public List<String> getConnections() {
        return connections;
    }

    public void setConnections(List<String> connections) {
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
}
