package com.Techmotion.appserver.repositiories;


import com.Techmotion.appserver.repositiories.model.UserRecord;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<UserRecord, String> {

}
