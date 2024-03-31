package com.Techmotion.appserver.service.model;

import java.time.LocalDateTime;

public class Notification {

    private final long id;
    private final String content;
    private final LocalDateTime timestamp;
    private final String type;
    private final long userId;


    public Notification(long id, String content, LocalDateTime timestamp, String type, long userId) {
        this.id = id;
        this.content = content;
        this.timestamp = timestamp;
        this.type = type;
        this.userId = userId;
    }

    public long getId() {
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

    public long getUserId() {
        return userId;
    }
}
