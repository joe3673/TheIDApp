package com.Techmotion.appserver.service.model;

import java.time.LocalDateTime;

public class Notification {

    private final String id;
    private final String content;
    private final LocalDateTime timestamp;
    private final String type; // String representation of notification type
    private final String userId;


    public Notification(String id, String content, LocalDateTime timestamp, String type, String userId) {
        this.id = id;
        this.content = content;
        this.timestamp = timestamp;
        this.type = type;
        this.userId = userId;
    }

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getType() {
        return type;
    }

    public String getUserId() {
        return userId;
    }
}
