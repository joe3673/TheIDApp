package com.Techmotion.appserver.repositiories.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import java.time.LocalDateTime;
import java.util.UUID;

@DynamoDBTable(tableName = "Messages")
public class MessageRecord {

    private Long messageId;

    private UUID senderID;

    private UUID receiverID;

    private String messageContent;

    private LocalDateTime sentTimestamp;

    private LocalDateTime receivedTimestamp;


    MessageRecord(){

    }

    MessageRecord(Long messageId, UUID senderID, UUID receiverID, String messageContent, LocalDateTime sentTimestamp){
        this.messageId = messageId;
        this.senderID = senderID;
        this.receiverID = receiverID;
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

    @DynamoDBAttribute(attributeName = "SenderID")
    public UUID getSenderID() {return senderID;}

    public void setSenderID(UUID senderID) {this.senderID = senderID;}

    @DynamoDBAttribute(attributeName = "ReceiverID")
    public UUID getReceiverID() {return receiverID;}

    public void setReceiverID(UUID receiverID) {this.receiverID = receiverID;}

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
