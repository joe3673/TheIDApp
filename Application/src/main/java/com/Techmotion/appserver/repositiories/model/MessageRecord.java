package com.Techmotion.appserver.repositiories.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import java.time.LocalDateTime;

@DynamoDBTable(tableName = "Messages")
public class MessageRecord {

    private Long messageId;

    private String messageContent;

    private final LocalDateTime sentTimestamp;

    private LocalDateTime receivedTimestamp;



    MessageRecord(Long messageId, String messageContent, LocalDateTime sentTimestamp){
        this.messageId = messageId;
        this.messageContent = messageContent;
        this.sentTimestamp = sentTimestamp;
    }

    @DynamoDBAttribute(attributeName = "MessageID")
    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    @DynamoDBAttribute(attributeName = "MessageContent")
    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    @DynamoDBAttribute(attributeName = "SentTimeStamp")
    public LocalDateTime getSentTimestamp() {
        return sentTimestamp;
    }

    @DynamoDBAttribute(attributeName = "ReceivedTimeStamp")
    public LocalDateTime getReceivedTimestamp() {
        return receivedTimestamp;
    }

    public void setReceivedTimestamp(LocalDateTime receivedTimestamp) {
        this.receivedTimestamp = receivedTimestamp;
    }
}
