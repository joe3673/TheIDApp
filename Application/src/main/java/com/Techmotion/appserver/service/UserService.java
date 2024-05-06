package com.Techmotion.appserver.service;

import com.Techmotion.appserver.exception.UserAlreadyExistException;
import com.Techmotion.appserver.exception.UserNotFoundException;
import com.Techmotion.appserver.repositiories.UserRepository;
import com.Techmotion.appserver.repositiories.model.UserRecord;
import com.Techmotion.appserver.service.model.User;
import com.Techmotion.appserver.service.model.UserSettings;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class UserService {

    private UserRepository userRepository;

    private UserSettingService userSettingService;


    public UserService(UserRepository userRepository, UserSettingService userSettingService){

        this.userRepository = userRepository;
        this.userSettingService = userSettingService;

    }

    // Creates new user after checking the repo. If the user isn't found, the method throws a null exception.
    public User createNewUser(User user) {
        Objects.requireNonNull(user, "The user can't be null");
        validateUserInfo(user);
        Random random = new Random();
        UserRecord record = new UserRecord(LocalDateTime.now().getNano() + random.nextLong(), user.getUserName(), user.getPassword(),
                user.getEmail(), user.getFirstName(), user.getLastName(), user.getAge(), LocalDateTime.now());

        userRepository.save(record);

        UserSettings userSettings = new UserSettings(user.getUserId());
        userSettings.setDarkMode(true);
        userSettings.setLanguagePreference("English");

        userSettingService.createNewUserSettings(userSettings);

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
    public UserRecord getUserRecordById(Long userID){
        return userRepository.findById(userID)
        .orElseThrow(()-> new UserNotFoundException("User Not Found"));
    }
    public User getUserByID(Long userID){

        return convertRecordToUser(getUserRecordById(userID));
    }

    private void checkIfUserExist(User user){
        Objects.requireNonNull(user, "User must not be null");
        Optional<UserRecord> record = userRepository.findByUsername(user.getUserName());

        if(record.isPresent()){
            throw new UserAlreadyExistException("A user with this username already exist.");
        }
    }

    public User updateUserLoginInfo(User user){
        Objects.requireNonNull(user, "User must not be null");
        UserRecord record = getUserRecordById(user.getUserId());
        record.setUserName(user.getUserName());
        record.setEmail(user.getEmail());
        record.setPhoneNumber(user.getPhoneNumber());

        userRepository.save(record);

        return user;
    }

    public User updateUserDatingProfile(User user){
        Objects.requireNonNull(user, "User must not be null");

        UserRecord record = getUserRecordById(user.getUserId());
        record.setDatingProfileName(user.getDatingProfileName());
        record.setDatingProfileBio(user.getDatingProfileBio());

        userRepository.save(record);

        return user;
    }

    public User updateUserBusinessProfile(User user){
        Objects.requireNonNull(user, "User must not be null");

        UserRecord record = getUserRecordById(user.getUserId());
        record.setBusinessProfileName(user.getBusinessProfileName());
        record.setBusinessProfileBio(user.getBusinessProfileBio());
        record.setCareerType(user.getCareerType());
        record.setTenure(user.getTenure());

        userRepository.save(record);


        return user;
        }

    public User updateUserPersonalProfile(User user){
        Objects.requireNonNull(user, "User must not be null");

        UserRecord record = getUserRecordById(user.getUserId());
        record.setPersonalProfileName(user.getPersonalProfileName());
        record.setPersonalProfileBio(user.getPersonalProfileBio());
        record.setHometown(user.getHometown());

        userRepository.save(record);

        return user;
    }

    public void deleteUser(User user){
        Objects.requireNonNull(user, "User must not be null");
        userRepository.deleteById(user.getUserId());

        userSettingService.deleteUserSettings(user.getUserId());

    }

    @Transactional
    public User addUserConnection(User user,Long connectionId){
        if(user==null ||connectionId == null ){
            throw new UserNotFoundException("User wasn't Found");
        }
       userRepository.addConnection(user.getUserId(),connectionId);
        return user;
    }

    public List<User> getUserConnection(User user,String userName){
        if(user==null){
            throw new UserNotFoundException("User Not Found");
        }
        List<User> userList = getAllUserConnections(user);
        return userList.stream()
                .filter(user1 -> user1.getUserName().contains(userName))
                .collect(Collectors.toList());
    }

    public List<User> getAllUserConnections(User user) {
        if(user==null){
            throw new UserNotFoundException("User Not Found");
        }
        UserRecord record = getUserRecordById(user.getUserId());
        List<Long> connections = record.getConnections();
        return connections.stream()
                .map(this::getUserRecordById)
                .map(this::convertRecordToUser)
                .collect(Collectors.toList());
    }

    public void deleteUserConnection(User user, UUID connectionToDeleteId)
    {
        if(user == null || connectionToDeleteId == null)
        {
            throw new UserNotFoundException("User Not Found");
        }
        List<Long> userList = user.getConnections();
        boolean checked = userList.remove(connectionToDeleteId);

        if(checked) {
            UserRecord record = getUserRecordById(user.getUserId());
            record.setConnections(userList);
            userRepository.save(record);}
        else
        {
            throw new UserNotFoundException("User was not deleted, please try again.");}
    }

    //Converts a User Record into a user object.
    public User convertRecordToUser(UserRecord userRecord) {

        Objects.requireNonNull(userRecord, "UserRecord must not be null");

         User user = new User(userRecord.getUserId(), userRecord.getUserName(),
                userRecord.getPassword(), userRecord.getEmail(), userRecord.getFirstName(),
                userRecord.getLastName(), userRecord.getAge(), userRecord.getSettingsId());

         user.setCreationDate(userRecord.getCreationDate());
         user.setLastLoginDate(userRecord.getLastLoginDate());
         user.setActiveStatus(user.isActiveStatus());
         user.setPhoneNumber(user.getPhoneNumber());
         user.setConnections(userRecord.getConnections());
         user.setBusinessProfileName(userRecord.getBusinessProfileName());
         user.setBusinessProfileBio(userRecord.getBusinessProfileBio());
         user.setOccupation(user.getOccupation());
         user.setTenure(userRecord.getTenure());
         user.setSkills(userRecord.getSkills());
         user.setDatingProfileName(userRecord.getDatingProfileName());
         user.setDatingProfileBio(userRecord.getDatingProfileBio());
         user.setHeight(userRecord.getHeight());
         user.setPersonalProfileName(userRecord.getPersonalProfileName());
         user.setDatingProfileBio(userRecord.getPersonalProfileBio());
         user.setBirthday(userRecord.getBirthday());
         user.setHometown(userRecord.getHometown());
         user.setEvents(userRecord.getEvents());

         return user;


    }








}
