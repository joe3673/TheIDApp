package com.Techmotion.appserver.repositiories;

import com.Techmotion.appserver.repositiories.model.UserSettingsRecord;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface UserSettingRepository extends CrudRepository<UserSettingsRecord, UUID> {
}
