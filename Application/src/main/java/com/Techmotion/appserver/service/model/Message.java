package com.Techmotion.appserver.service.model;

import java.time.LocalDateTime;

public class Message {

    private final Long id;

    private String content;

    private final LocalDateTime timeSent;

    private final Long senderId;

    private final Long recipientId;

    public Message(Long id, String content, Long senderId, Long recipientId, LocalDateTime timeSent) {
        this.id = id;
        this.content = content;
        this.timeSent = timeSent;
        this.senderId = senderId;
        this.recipientId = recipientId;
    }

    public Long getId() {
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

    public Long getSenderId() {
        return senderId;
    }

    public Long getRecipientId() {
        return recipientId;
    }
}
