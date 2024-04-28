package com.Techmotion.appserver.repositiories;


import com.Techmotion.appserver.repositiories.model.UserRecord;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;


public interface UserRepository extends CrudRepository<UserRecord, UUID> {

}
