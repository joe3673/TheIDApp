package com.Techmotion.appserver.repositiories.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import java.time.LocalDateTime;

@DynamoDBTable(tableName = "Events")
public class EventRecord {

    private long eventID;

    private String eventName;

    private String eventDescription;

    private String location;

    private String hostingOrganizationName;

    private LocalDateTime eventStartTime;

    private LocalDateTime eventEndTime;



    @DynamoDBHashKey(attributeName = "EventID")
    public long getEventID() {
        return eventID;
    }

    public void setEventID(long eventID) {
        this.eventID = eventID;
    }

    @DynamoDBAttribute(attributeName = "EventName")
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName){
        this.eventName = eventName;}

    @DynamoDBAttribute(attributeName = "EventDescription")
    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    @DynamoDBAttribute(attributeName = "Location")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @DynamoDBAttribute(attributeName = "HostingOrganizationName")
    public String getHostingOrganizationName() {
        return hostingOrganizationName;
    }

    public void setHostingOrganizationName(String organizationName){
        this.hostingOrganizationName=organizationName;
    }

    @DynamoDBAttribute(attributeName = "EventStartTime")
    public LocalDateTime getEventStartTime() {
        return eventStartTime;
    }

    public void setEventStartTime(LocalDateTime eventStartTime){
        this.eventStartTime = eventStartTime;
    }


    @DynamoDBAttribute(attributeName = "EventEndTime")
    public LocalDateTime getEventEndTime() {
        return eventEndTime;
    }

    public void setEventEndTime(LocalDateTime eventEndTime) {
        this.eventEndTime = eventEndTime;
    }
}

