package com.Techmotion.appserver.controller.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class EventUpdateRequest {

    @JsonProperty("eventName")
    private String eventName;

    @JsonProperty("eventDescription")
    private String eventDescription;

    @JsonProperty("hostingOrganizationName")
    private String hostingOrganizationName;

    @JsonProperty("location")
    private String location;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @JsonProperty("eventStartTime")
    private LocalDateTime eventStartTime;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @JsonProperty("eventEndTime")
    private LocalDateTime eventEndTime;


    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHostingOrganizationName() {
        return hostingOrganizationName;
    }

    public void setHostingOrganizationName(String hostingOrganizationName) {
        this.hostingOrganizationName = hostingOrganizationName;
    }

    public LocalDateTime getEventStartTime() {
        return eventStartTime;
    }

    public void setEventStartTime(LocalDateTime eventStartTime) {
        this.eventStartTime = eventStartTime;
    }

    public LocalDateTime getEventEndTime() {
        return eventEndTime;
    }

    public void setEventEndTime(LocalDateTime eventEndTime) {
        this.eventEndTime = eventEndTime;
    }
}
