package com.Techmotion.appserver.service.model;

import java.time.LocalDateTime;

public class Message {

    private final String id;

    private String content;

    private final LocalDateTime timeSent;

    private final String senderId;

    private final String recipientId;

    public Message(String id, String content, String senderId, String recipientId) {
        this.id = id;
        this.content = content;
        this.timeSent = LocalDateTime.now();
        this.senderId = senderId;
        this.recipientId = recipientId;
    }

    public String getId() {
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

    public String getSenderId() {
        return senderId;
    }

    public String getRecipientId() {
        return recipientId;
    }
}
