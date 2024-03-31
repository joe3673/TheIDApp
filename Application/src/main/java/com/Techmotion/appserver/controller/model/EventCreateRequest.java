package com.Techmotion.appserver.controller.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class EventCreateRequest {

    @JsonProperty("eventID")
    private long eventID;

    @JsonProperty("eventName")
    private String eventName;

    @JsonProperty("eventDescription")
    private String eventDescription;

    @JsonProperty("location")
    private String location;

    @JsonProperty("hostingOrganizationName")
    private String hostingOrganizationName;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @JsonProperty("eventStartTime")
    private LocalDateTime eventStartTime;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @JsonProperty("eventEndTime")
    private LocalDateTime eventEndTime;

    public long getEventID() {
        return eventID;
    }

    public void setEventID(long eventID) {
        this.eventID = eventID;
    }

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
