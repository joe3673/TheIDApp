package com.Techmotion.appserver.repositiories;

import com.Techmotion.appserver.repositiories.model.UserSettingRecord;
import org.springframework.data.repository.CrudRepository;

public interface UserSettingRepository extends CrudRepository<UserSettingRecord,String> {
}
