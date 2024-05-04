package com.Techmotion.appserver.service.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Message {

    private final UUID id;

    private String content;

    private final LocalDateTime timeSent;

    private final UUID senderId;

    private final UUID recipientId;

    public Message(UUID id, String content, UUID senderId, UUID recipientId,LocalDateTime timeSent) {
        this.id = id;
        this.content = content;
        this.timeSent = timeSent;
        this.senderId = senderId;
        this.recipientId = recipientId;
    }

    public UUID getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getTimeSent() {
        return timeSent;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public UUID getSenderId() {
        return senderId;
    }

    public UUID getRecipientId() {
        return recipientId;
    }
}
