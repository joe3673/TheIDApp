package com.Techmotion.appserver.controller;

import com.Techmotion.appserver.service.MessageService;
import com.Techmotion.appserver.service.UserService;
import com.Techmotion.appserver.service.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessageController {

    @Autowired
    private final MessageService messageService;

    private final UserService userService;

    public MessageController(MessageService messageService,UserService userService) {
        this.messageService = messageService;
        this.userService = userService;

    }

    @PostMapping("/send")
    public ResponseEntity<Message> sendMessage(
            @RequestParam("senderId") Long senderId,
            @RequestParam("receiverId") Long receiverId,
            @RequestParam("content") String content) {

        Message sentMessage = messageService.sendMessage(senderId, receiverId, content);
        return ResponseEntity.ok(sentMessage);
    }

    @GetMapping("/retrieve")
    public ResponseEntity<List<Message>> retrieveMessages(
            @RequestParam("senderId") Long senderId,
            @RequestParam("receiverId") Long receiverId) {

        // Retrieve sender and receiver from database

        // Retrieve messages between sender and receiver
        List<Message> messages = messageService.getMessagesBySenderAndReceiver(senderId, receiverId);
        return ResponseEntity.ok(messages);
    }

}
