package com.Techmotion.appserver.service.model.UserSubClasses;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class PrivacySettings {
    private Map<String, Boolean> visibilitySettings; // Map<ProfileField, Boolean>
    private List<String> blockedUsers;

    public Map<String, Boolean> getVisibilitySettings() {
        return visibilitySettings;
    }

    public void setVisibilitySettings(Map<String, Boolean> visibilitySettings) {
        this.visibilitySettings = visibilitySettings;
    }

    public List<String> getBlockedUsers() {
        return blockedUsers;
    }

    public void setBlockedUsers(List<String> blockedUsers) {
        this.blockedUsers = blockedUsers;
    }
}
