package com.Techmotion.appserver.service.model.UserSubClasses;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Security {

    private List<String> securityQuestions;

    private boolean twoFactorAuthentication;

    public List<String> getSecurityQuestions() {
        return securityQuestions;
    }

    public void setSecurityQuestions(List<String> securityQuestions) {
        this.securityQuestions = securityQuestions;
    }

    public boolean isTwoFactorAuthentication() {
        return twoFactorAuthentication;
    }

    public void setTwoFactorAuthentication(boolean twoFactorAuthentication) {
        this.twoFactorAuthentication = twoFactorAuthentication;
    }
}
