package com.Techmotion.appserver.service.model;

import com.Techmotion.appserver.Enum.NotificationType;

import java.time.LocalDateTime;
import java.util.UUID;

public class Notification {

    private final UUID id;
    private final String content;
    private final LocalDateTime timestamp;
    private final NotificationType type;
    private final long userId;


    public Notification(UUID id, String content, LocalDateTime timestamp, NotificationType type, long userId) {
        this.id = id;
        this.content = content;
        this.timestamp = timestamp;
        this.type = type;
        this.userId = userId;
    }

    public UUID getId() {
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
