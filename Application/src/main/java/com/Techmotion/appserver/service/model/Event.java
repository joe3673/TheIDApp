package com.Techmotion.appserver.service.model;

import java.time.LocalDateTime;

public class Event {


    private final Long eventID;

    private final Long HostingOrganizationID;

    private final String eventName;

    private String eventDescription;

    private String location;

    private final String hostingOrganizationName;

    private final LocalDateTime eventStartTime;

    private LocalDateTime eventEndTime;

    public Event(Long eventID, Long hostingOrganizationID, String eventName, String eventDescription, String hostingOrganizationName, LocalDateTime eventStartTime
    ,LocalDateTime eventEndTime) {
        this.eventID = eventID;
        this.HostingOrganizationID = hostingOrganizationID;
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.hostingOrganizationName = hostingOrganizationName;
        this.eventStartTime = eventStartTime;
        this.eventEndTime = eventEndTime;
    }


    public Long getEventID() {
        return eventID;
    }

    public Long getHostingOrganizationID() {
        return HostingOrganizationID;
    }

    public String getEventName() {
        return eventName;
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

    public LocalDateTime getEventStartTime() {
        return eventStartTime;
    }


    public LocalDateTime getEventEndTime() {
        return eventEndTime;
    }

    public void setEventEndTime(LocalDateTime eventEndTime) {
        this.eventEndTime = eventEndTime;
    }
}
