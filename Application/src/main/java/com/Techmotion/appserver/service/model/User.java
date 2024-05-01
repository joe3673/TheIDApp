package com.Techmotion.appserver.service.model;

import com.Techmotion.appserver.Enum.CareerType;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Component
public class User {

    private final UUID userId;

    private String userName;

    private String password;

    private String email;

    private String firstName;

    private String lastName;

    private final int age;

    private LocalDateTime creationDate;
    private LocalDateTime lastLoginDate;
    private boolean activeStatus;

    private String phoneNumber;

    private List<UUID> connections;


    private String businessProfileName;

    private CareerType careerType;

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

    private final UUID SettingsId;

    private List<UUID> events;








    public User(UUID userId, String userName, String password, String email, String firstName, String lastName, int age, UUID settingsId) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        SettingsId = settingsId;
    }

    public UUID getUserId() {
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


    public List<UUID> getConnections() {
        return connections;
    }

    public void setConnections(List<UUID> connections) {
        this.connections = connections;
    }

    public String getBusinessProfileName() {
        return businessProfileName;
    }

    public void setBusinessProfileName(String businessProfileName) {
        this.businessProfileName = businessProfileName;
    }

    public String getCareerType() {
        return careerType.getValue();
    }

    public void setCareerType(CareerType careerType) {
        this.careerType =careerType;
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

    public UUID getSettingsId() {
        return SettingsId;
    }

    public List<UUID> getEvents() {
        return events;
    }

    public void setEvents(List<UUID> events) {
        this.events = events;
    }
}
