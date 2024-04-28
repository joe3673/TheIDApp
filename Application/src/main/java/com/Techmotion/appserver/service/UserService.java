package com.Techmotion.appserver.service;

import com.Techmotion.appserver.exception.UserNotFoundException;
import com.Techmotion.appserver.repositiories.EventRepository;
import com.Techmotion.appserver.repositiories.UserRepository;
import com.Techmotion.appserver.repositiories.model.UserRecord;
import com.Techmotion.appserver.service.model.User;
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



    public UserRecord getUser(long userID){

        return userRepository.findById(userID)
        .orElseThrow(()-> new UserNotFoundException("User Not Found"));
    }

    public boolean validateUser (Long id, String password){
        Optional<UserRecord> user = userRepository.findById(id);
        if(user.isPresent()){
            UserRecord userRecord = user.get();
            return userRecord.getPassword().equals(password);
        }
        return false;
    }

    public UserRecord addNewUser(User user) {

        UserRecord userRecord = new UserRecord(user.getUserId(), user.getUserName(), user.getPassword(),
                user.getEmail(), user.getFirstName(), user.getLastName(), user.getAge());

        userRepository.save(userRecord);

        return userRecord;
    }

    public UserRecord updateUserLoginInfo(User user){
        return null;
    }

    public UserRecord updateUserDatingProfile(User user){

        return null;
    }

    public UserRecord updateUserBusinessProfile(User user){

        return null;
    }

    public UserRecord updateUserPersonalProfile(User user){
        return null;
    }

    public void deleteUser(User user){
        userRepository.deleteById(user.getUserId());

    }




}
