package com.Techmotion.appserver.service;

import com.Techmotion.appserver.exception.UserAlreadyExistException;
import com.Techmotion.appserver.exception.UserNotFoundException;
import com.Techmotion.appserver.repositiories.EventRepository;
import com.Techmotion.appserver.repositiories.MessageRepository;
import com.Techmotion.appserver.repositiories.UserRepository;
import com.Techmotion.appserver.repositiories.UserSettingRepository;
import com.Techmotion.appserver.repositiories.model.UserRecord;
import com.Techmotion.appserver.service.model.User;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserService {

    private UserRepository userRepository;

    private MessageRepository messageRepository;
    private EventRepository eventRepository;

    private UserSettingRepository userSettingRepository;

    public UserService(UserRepository userRepository, EventRepository eventRepository, MessageRepository messageRepository, UserSettingRepository userSettingRepository){

        this.userRepository = userRepository;
        this.eventRepository = eventRepository;
        this.messageRepository = messageRepository;
        this.userSettingRepository = userSettingRepository;
    }

    public User createNewUser(User user) {
        if(user==null){
            throw new UserNotFoundException("User not found.");
        }
        validateUserInfo(user);
        UserRecord record = new UserRecord(user.getUserId(), user.getUserName(), user.getPassword(),
                user.getEmail(), user.getFirstName(), user.getLastName(), user.getAge(), LocalDateTime.now());

        userRepository.save(record);

        return user;
    }

    private void validateUserInfo(User user){
        checkIfUserExist(user);
        if(user.getUserName().length() >15 || user.getUserName() == null){
            throw new IllegalArgumentException("Exceeded character limit of 15.");
        }
        if (user.getEmail() == null ||!user.getEmail().contains("@") || !user.getEmail().contains(".")){
            throw new IllegalArgumentException("Invalid E-mail. Please try again.");
        }
        if(user.getPassword().length()>15){
            throw new IllegalArgumentException("Exceeded Character Limit of 15");
        }
        if(user.getFirstName().length()>15){
            throw new IllegalArgumentException("Exceeded Character Limit of 15");
        }
        if(user.getLastName().length()>15){
            throw new IllegalArgumentException("Exceeded Character Limit of 15");
        }
        if(user.getAge()>99 ||user.getAge()<18){
            throw new IllegalArgumentException("You're either too old or too young to be on this app.");
        }

    }
    public UserRecord getUserRecord(UUID userID){
        return userRepository.findById(userID)
        .orElseThrow(()-> new UserNotFoundException("User Not Found"));
    }

    private void checkIfUserExist(User user){
        Objects.requireNonNull(user, "User must not be null");
        Optional<UserRecord> record = userRepository.findById(user.getUserId());

        if(record.isPresent()){
            throw new UserAlreadyExistException("A user with this username already exist.");
        }
    }

    public User updateUserLoginInfo(User user){
        Objects.requireNonNull(user, "User must not be null");
        UserRecord record = getUserRecord(user.getUserId());
        record.setUserName(user.getUserName());
        record.setEmail(user.getEmail());
        record.setPhoneNumber(user.getPhoneNumber());

        userRepository.save(record);

        return user;
    }

    public User updateUserDatingProfile(User user){
        Objects.requireNonNull(user, "User must not be null");
        UserRecord record = getUserRecord(user.getUserId());
        record.setDatingProfileName(user.getDatingProfileName());
        record.setDatingProfileBio(user.getDatingProfileBio());

        userRepository.save(record);

        return user;
    }

    public User updateUserBusinessProfile(User user){
        Objects.requireNonNull(user, "User must not be null");
        UserRecord record = getUserRecord(user.getUserId());
        record.setBusinessProfileName(user.getBusinessProfileName());
        record.setBusinessProfileBio(user.getBusinessProfileBio());
        record.setCareerType(user.getCareerType());
        record.setTenure(user.getTenure());

        userRepository.save(record);


        return user;
        }

    public User updateUserPersonalProfile(User user){
        Objects.requireNonNull(user, "User must not be null");
        UserRecord record = getUserRecord(user.getUserId());
        record.setPersonalProfileName(user.getPersonalProfileName());
        record.setPersonalProfileBio(user.getPersonalProfileBio());
        record.setHometown(user.getHometown());

        userRepository.save(record);

        return user;
    }

    public void deleteUser(User user){
        Objects.requireNonNull(user, "User must not be null");
        userRepository.deleteById(user.getUserId());

    }

    @Transactional
    public User addUserConnection(User user,UUID connectionId){
        if(user==null ||connectionId == null ){
            throw new UserNotFoundException("User wasn't Found");
        }
       userRepository.addConnection(user.getUserId(),connectionId);
        return user;
    }

    public List<UserRecord> getUserConnection(User user,String userName){
        if(user==null){
            throw new UserNotFoundException("User Not Found");
        }
        List<UserRecord> userList = getAllUserConnections(user.getUserId());
        return userList.stream()
                .filter(user1 -> user1.getUserName().contains(userName))
                .collect(Collectors.toList());
    }

    public List<UserRecord> getAllUserConnections(UUID userID) {
        if(userID==null){
            throw new UserNotFoundException("User Not Found");
        }
        UserRecord record = getUserRecord(userID);
        List<UUID> connections = record.getConnections();
        return connections.stream()
                .map(this::getUserRecord)
                .collect(Collectors.toList());
    }

    public void deleteUserConnection(User user, UUID connectionToDeleteId){
        if(user == null || connectionToDeleteId == null){throw new UserNotFoundException("User Not Found");}

        List<UUID> userList = user.getConnections();
        boolean checked = userList.remove(connectionToDeleteId);

        if(checked) {
            UserRecord record = getUserRecord(user.getUserId());
            record.setConnections(userList);
            userRepository.save(record);}
        else
        {throw new UserNotFoundException("User was not deleted, please try again.");}
    }

    public List<UUID> getAllUserEventsAttended(User user){


        return  null;
    }
    public User updateUserSettings(User user){


          return null;
    }







}
