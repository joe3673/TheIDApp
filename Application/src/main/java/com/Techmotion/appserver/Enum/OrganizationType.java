package com.Techmotion.appserver.Enum;

public enum OrganizationType {
    STORE("Store"),
    CLOTHING("Clothing"),
    SHOES("Shoes"),
    ELECTRONICS("Electronics"),
    FURNITURE("Furniture"),
    RESTAURANT("Restaurant"),
    CAFE("Cafe"),
    BAR("Bar"),
    GYM("Gym"),
    ;




    private final String value;

    OrganizationType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
