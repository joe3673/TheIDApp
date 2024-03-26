package com.Techmotion.appserver.service.model.UserSubClasses;

import org.springframework.stereotype.Component;

@Component
public class BusinessProfile {

    private String businessProfileName;

    private String careerType;

    private String occupation;

    private int tenure;

    private String skills;

    private String businessProfileBio;

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
}
