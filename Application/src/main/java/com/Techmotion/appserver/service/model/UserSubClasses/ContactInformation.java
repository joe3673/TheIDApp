package com.Techmotion.appserver.service.model.UserSubClasses;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ContactInformation {

    private String phoneNumber;

    private List<String> socialMediaProfiles;

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
}
