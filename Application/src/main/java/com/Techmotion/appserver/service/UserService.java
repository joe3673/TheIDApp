package com.Techmotion.appserver.service;

import com.Techmotion.appserver.repositiories.EventRepository;
import com.Techmotion.appserver.repositiories.UserRepository;
import com.Techmotion.appserver.repositiories.model.UserRecord;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    private EventRepository eventRepository;


    public UserService(UserRepository userRepository, EventRepository eventRepository){

        this.userRepository = userRepository;
        this.eventRepository = eventRepository;
    }



    public UserRecord getUser(String userID){
        Optional<UserRecord> optionalUserRecord = userRepository.findById(userID);

        if(optionalUserRecord.isEmpty()){
            throw new RuntimeException();
        }
        return optionalUserRecord.get();


    }
}
