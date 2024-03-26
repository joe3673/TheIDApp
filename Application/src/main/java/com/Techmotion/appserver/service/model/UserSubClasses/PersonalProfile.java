package com.Techmotion.appserver.service.model.UserSubClasses;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class PersonalProfile {

    private String personalProfileName;

    private String personalProfileBio;

    private LocalDateTime birthday;

    private String hometown;

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
