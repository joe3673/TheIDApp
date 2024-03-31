package com.Techmotion.appserver.controller.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.List;

public class UserUpdateRequest {


    @JsonProperty("userName")
    private String userName;

    @JsonProperty("password")
    private String password;

    @JsonProperty("email")
    private String email;

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;


    @JsonProperty("creationDate")
    private LocalDateTime creationDate;

    @JsonProperty("lastLoginDate")
    private LocalDateTime lastLoginDate;

    @JsonProperty("activeStatus")
    private boolean activeStatus;

    @JsonProperty("phoneNumber")
    private String phoneNumber;

    @JsonProperty("socialMediaProfiles")
    private List<String> socialMediaProfiles;

    @JsonProperty("connections")
    private List<String> connections;


    @JsonProperty("businessProfileName")
    private String businessProfileName;

    @JsonProperty("careerType")
    private String careerType;

    @JsonProperty("occupation")
    private String occupation;

    @JsonProperty("tenure")
    private int tenure;

    @JsonProperty("skills")
    private String skills;

    @JsonProperty("businessProfileBio")
    private String businessProfileBio;

    @JsonProperty("datingProfileName")
    private String datingProfileName;

    @JsonProperty("datingProfileBio")
    private String datingProfileBio;

    @JsonProperty("height")
    private double height;

    @JsonProperty("personalProfileName")
    private String personalProfileName;

    @JsonProperty("personalProfileBio")
    private String personalProfileBio;

    @JsonProperty("birthday")
    private LocalDateTime birthday;

    @JsonProperty("hometown")
    private String hometown;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(LocalDateTime lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public boolean isActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(boolean activeStatus) {
        this.activeStatus = activeStatus;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<String> getSocialMediaProfiles() {
        return socialMediaProfiles;
    }

    public void setSocialMediaProfiles(List<String> socialMediaProfiles) {
        this.socialMediaProfiles = socialMediaProfiles;
    }

    public List<String> getConnections() {
        return connections;
    }

    public void setConnections(List<String> connections) {
        this.connections = connections;
    }

    public String getBusinessProfileName() {
        return businessProfileName;
    }

    public void setBusinessProfileName(String businessProfileName) {
        this.businessProfileName = businessProfileName;
    }

    public String getCareerType() {
        return careerType;
    }

    public void setCareerType(String careerType) {
        this.careerType = careerType;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getBusinessProfileBio() {
        return businessProfileBio;
    }

    public void setBusinessProfileBio(String businessProfileBio) {
        this.businessProfileBio = businessProfileBio;
    }

    public String getDatingProfileName() {
        return datingProfileName;
    }

    public void setDatingProfileName(String datingProfileName) {
        this.datingProfileName = datingProfileName;
    }

    public String getDatingProfileBio() {
        return datingProfileBio;
    }

    public void setDatingProfileBio(String datingProfileBio) {
        this.datingProfileBio = datingProfileBio;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getPersonalProfileName() {
        return personalProfileName;
    }

    public void setPersonalProfileName(String personalProfileName) {
        this.personalProfileName = personalProfileName;
    }

    public String getPersonalProfileBio() {
        return personalProfileBio;
    }

    public void setPersonalProfileBio(String personalProfileBio) {
        this.personalProfileBio = personalProfileBio;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

}
