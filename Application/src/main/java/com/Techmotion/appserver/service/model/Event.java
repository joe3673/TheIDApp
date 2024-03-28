package com.Techmotion.appserver.service.model;

import java.time.LocalDateTime;

public class Event {


    private final String eventID;

    private final String eventName;

    private String eventDescription;

    private final String hostingOrganizationName;

    private final LocalDateTime eventStartTime;

    private LocalDateTime eventEndTime;

    public Event(String eventID, String eventName, String hostingOrganizationName, LocalDateTime eventStartTime) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.hostingOrganizationName = hostingOrganizationName;
        this.eventStartTime = eventStartTime;
    }


    public String getEventID() {
        return eventID;
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
