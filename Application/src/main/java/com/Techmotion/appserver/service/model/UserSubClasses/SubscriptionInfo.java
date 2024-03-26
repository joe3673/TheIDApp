package com.Techmotion.appserver.service.model.UserSubClasses;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class SubscriptionInfo {

    private boolean subscribed;
    private String membershipLevel;
    private LocalDateTime expiryDate;

    public boolean isSubscribed() {
        return subscribed;
    }

    public void setSubscribed(boolean subscribed) {
        this.subscribed = subscribed;
    }

    public String getMembershipLevel() {
        return membershipLevel;
    }

    public void setMembershipLevel(String membershipLevel) {
        this.membershipLevel = membershipLevel;
    }

    public LocalDateTime getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDateTime expiryDate) {
        this.expiryDate = expiryDate;
    }
}
