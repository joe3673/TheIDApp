package com.Techmotion.appserver.service.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Message {

    private final UUID id;

    private String content;

    private final LocalDateTime timeSent;

    private final long senderId;

    private final long recipientId;

    public Message(UUID id, String content, long senderId, long recipientId) {
        this.id = id;
        this.content = content;
        this.timeSent = LocalDateTime.now();
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

    public long getSenderId() {
        return senderId;
    }

    public long getRecipientId() {
        return recipientId;
    }
}
