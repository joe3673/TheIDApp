package com.Techmotion.appserver.service.model.UserSubClasses;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class AccountStatus {

    private LocalDateTime creationDate;
    private LocalDateTime lastLoginDate;
    private String status;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
