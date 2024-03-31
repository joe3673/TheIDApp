package com.Techmotion.appserver.repositiories;

import com.Techmotion.appserver.repositiories.model.NotificationRecord;
import org.springframework.data.repository.CrudRepository;

public interface NotificationRepository extends CrudRepository <NotificationRecord, Long>{
}
