package com.Techmotion.appserver.service;

import com.Techmotion.appserver.repositiories.UserSettingRepository;
import com.Techmotion.appserver.repositiories.model.UserSettingsRecord;
import com.Techmotion.appserver.service.model.UserSettings;

import java.util.UUID;

public class UserSettingService {

    UserSettingRepository userSettingRepository;


    public UserSettingService(UserSettingRepository userSettingRepository){

        this.userSettingRepository = userSettingRepository;
    }



    public void createNewUserSettings(UserSettings userSettings){

        UserSettingsRecord userSettingsRecord = new UserSettingsRecord();
        userSettingsRecord.setUserID(userSettings.getUserID());
        userSettingsRecord.setLanguagePreference(userSettings.getLanguagePreference());
        userSettingsRecord.setDarkMode(userSettings.isDarkMode());

        userSettingRepository.save(userSettingsRecord);

    }



    public void deleteUserSettings(long userSettingsID){

        userSettingRepository.deleteById(userSettingsID);
    }
}
