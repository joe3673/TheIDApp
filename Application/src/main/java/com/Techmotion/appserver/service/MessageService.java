package com.Techmotion.appserver.service;

import com.Techmotion.appserver.exception.UserNotFoundException;
import com.Techmotion.appserver.repositiories.MessageRepository;
import com.Techmotion.appserver.repositiories.model.MessageRecord;
import com.Techmotion.appserver.service.model.Message;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class MessageService {

    private final MessageRepository messageRepository;



    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Transactional
    public Message sendMessage(Long sender, Long receiver, String content){

        if(sender == null || receiver == null || content == null){
            throw new UserNotFoundException("User or Message Could Not be found.");
        }
        if (content.length() > 2000){
            throw new RuntimeException("Exceeded Character limit");
        }
        Random random = new Random();

        MessageRecord messageRecord = new MessageRecord(LocalDateTime.now().getNano() + random.nextLong(),sender,receiver,content, LocalDateTime.now());
        return convertRecordToMessage(messageRepository.save(messageRecord));
    }



    public List<Message> getMessagesBySenderAndReceiver(Long sender, Long receiver){
        if(sender == null || receiver == null){
            throw new UserNotFoundException("User or Message Could Not be found.");
        }

        List<MessageRecord>  messageRecords= messageRepository.findBySenderAndReceiver(sender, receiver);

        return messageRecords.stream().map(this::convertRecordToMessage)
                .collect(Collectors.toList());
    }

    public Message convertRecordToMessage(MessageRecord messageRecord){
        Objects.requireNonNull(messageRecord);

        return new Message(messageRecord.getMessageId(), messageRecord.getMessageContent(),
                messageRecord.getSenderID(), messageRecord.getReceiverID(),
                messageRecord.getSentTimestamp());
    }
}
