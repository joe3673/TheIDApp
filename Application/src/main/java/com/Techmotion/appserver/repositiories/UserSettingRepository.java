package com.Techmotion.appserver.repositiories;

import com.Techmotion.appserver.repositiories.model.UserSettingsRecord;
import org.springframework.data.repository.CrudRepository;

public interface UserSettingRepository extends CrudRepository<UserSettingsRecord, Long> {
}
