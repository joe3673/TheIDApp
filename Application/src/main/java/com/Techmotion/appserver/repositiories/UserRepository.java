package com.Techmotion.appserver.repositiories;


import com.Techmotion.appserver.repositiories.model.UserRecord;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


public interface UserRepository extends CrudRepository<UserRecord, Long> {

    @Modifying
    @Transactional
    @Query("UPDATE UserRecord u SET u.connections = CONCAT(u.connections, ?2) WHERE u.userId = ?1")
    void addConnection(long userId, Long connectionId);

    Optional<UserRecord> findByUsername(String Username);

}







