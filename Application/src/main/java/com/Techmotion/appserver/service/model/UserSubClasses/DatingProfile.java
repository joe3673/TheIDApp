package com.Techmotion.appserver.service.model.UserSubClasses;

import org.springframework.stereotype.Component;

@Component
public class DatingProfile {

    private String datingProfileName;

    private String datingProfileBio;

    private double height;

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
}
