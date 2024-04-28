package com.Techmotion.appserver.Enum;

public enum CareerType {

    TECHNOLOGY("Technology"),
    HEALTHCARE("HealthCare"),
    MUSIC("Music"),
    DANCE("Dance"),
    FINANCE("Finance"),
    EDUCATION("Education"),
    ENGINEERING("Engineering"),
    HOSPITALITY("Hospitality"),
    ART_AND_DESIGN("Art and Design"),
    LAW("Law"),
    SCIENCE("Science"),
    MARKETING_AND_ADVERTISING("Marketing and Advertising"),
    GOVERNMENT_AND_PUBLIC_SERVICE("Government and Public Service"),
    SPORTS("Sports"),
    OTHER("Other");



    private final String value;

    CareerType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
