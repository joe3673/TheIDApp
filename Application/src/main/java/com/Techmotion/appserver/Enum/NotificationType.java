package com.Techmotion.appserver.Enum;

public enum NotificationType {

    SOCIAL("Social"),
    SYSTEM("System"),
    EVENT("Event"),
    ORGANIZATION("Organization"),
    DATING("Dating"),
    BUSINESS("Business"),
    PERSONAL("Personal");


    private final String value;

    NotificationType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    }


