package com.Techmotion.appserver.service;

import com.Techmotion.appserver.repositiories.MessageRepository;
import com.Techmotion.appserver.service.model.Message;

import java.util.List;
import java.util.UUID;

public class MessageService {

    private final MessageRepository messageRepository;

    private final UserService userService;

    public MessageService(MessageRepository messageRepository, UserService userService) {
        this.messageRepository = messageRepository;
        this.userService = userService;
    }


    public Message sendMessage(UUID sender, UUID receiver, String content){


        return null;
    }

    public List<Message> getMessagesBySenderAndReceiver(UUID sender, UUID Receiver){

        return null;
    }
}
