package com.Techmotion.appserver.service;

import com.Techmotion.appserver.exception.UserAlreadyExistException;
import com.Techmotion.appserver.exception.UserNotFoundException;
import com.Techmotion.appserver.repositiories.EventRepository;
import com.Techmotion.appserver.repositiories.MessageRepository;
import com.Techmotion.appserver.repositiories.UserRepository;
import com.Techmotion.appserver.repositiories.model.MessageRecord;
import com.Techmotion.appserver.repositiories.model.UserRecord;
import com.Techmotion.appserver.service.model.User;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    private UserRepository userRepository;

    private MessageRepository messageRepository;
    private EventRepository eventRepository;

    public UserService(UserRepository userRepository, EventRepository eventRepository){

        this.userRepository = userRepository;
        this.eventRepository = eventRepository;
    }

    public User createNewUser(User user) {
        if(user==null){
            throw new UserNotFoundException("User not found.");
        }
        checkIfUserExist(user);
        UserRecord userRecord = new UserRecord(user.getUserId(), user.getUserName(), user.getPassword(),
                user.getEmail(), user.getFirstName(), user.getLastName(), user.getAge(), LocalDateTime.now());

        return convertRecordToUser(userRepository.save(userRecord));
    }

    private void validateUserInfo(User user){

    }
    public UserRecord getUser(UUID userID){
        return userRepository.findById(userID)
        .orElseThrow(()-> new UserNotFoundException("User Not Found"));
    }

    private void checkIfUserExist(User user){
        if(user==null){
            throw new UserNotFoundException("User not found.");
        }
        Optional<UserRecord> record = userRepository.findById(user.getUserId());

        if(record.isPresent()){
            throw new UserAlreadyExistException("A user with this username already exist.");
        }
    }

    public User updateUserLoginInfo(User user){

        if(user==null){
            throw new UserNotFoundException("User Not Found");
        }
        UserRecord record = getUser(user.getUserId());
        record.setUserName(user.getUserName());
        record.setEmail(user.getEmail());
        record.setPhoneNumber(user.getPhoneNumber());

        userRepository.save(record);

        return convertRecordToUser(record);
    }

    public User updateUserDatingProfile(User user){
        if(user==null){
            throw new UserNotFoundException("User Not Found");
        }

        UserRecord record = getUser(user.getUserId());
        record.setDatingProfileName(user.getDatingProfileName());
        record.setDatingProfileBio(user.getDatingProfileBio());

        userRepository.save(record);

        return convertRecordToUser(record);
    }

    public User updateUserBusinessProfile(User user){
        if(user==null){
            throw new UserNotFoundException("User Not Found");
        }

        return null;
    }

    public User updateUserPersonalProfile(User user){
        if(user==null){
            throw new UserNotFoundException("User Not Found");
        }
        return null;
    }

    public void deleteUser(User user){
        userRepository.deleteById(user.getUserId());

    }


    public UserRecord addUserConnection(User user,Long userId){

        return null;
    }

    public UserRecord getUserConnection(User user,Long connectionID){

        return null;
    }

    public List<UUID> getAllUserConnections(User user) {

    return  new ArrayList<>();
    }

    public void deleteUserConnection(Long userId){

    }

    public MessageRecord sendMessage(User sender, User Receiver, String content){

        return null;
    }


    public List<UUID> getAllUserEventsAttended(){
        return  null;
    }


    public User convertRecordToUser(UserRecord userRecord){
        return new User(userRecord.getUserId(), userRecord.getUserName(), userRecord.getPassword(),
                userRecord.getEmail(), userRecord.getFirstName(),
                userRecord.getLastName(), userRecord.getAge(), userRecord.getSettingsId());
    }



}
