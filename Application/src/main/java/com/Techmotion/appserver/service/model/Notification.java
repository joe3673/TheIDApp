package com.Techmotion.appserver.service.model;

import com.Techmotion.appserver.Enum.NotificationType;

import java.time.LocalDateTime;

public class Notification {

    private final long id;
    private final String content;
    private final LocalDateTime timestamp;
    private final NotificationType type;
    private final long userId;


    public Notification(long id, String content, LocalDateTime timestamp, NotificationType type, long userId) {
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

    public NotificationType getType() {
        return type;
    }

    public long getUserId() {
        return userId;
    }
}
