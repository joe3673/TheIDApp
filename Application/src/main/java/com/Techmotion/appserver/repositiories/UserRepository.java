package com.Techmotion.appserver.repositiories;


import com.Techmotion.appserver.repositiories.model.UserRecord;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;


public interface UserRepository extends CrudRepository<UserRecord, UUID> {

    @Modifying
    @Transactional
    @Query("UPDATE UserRecord u SET u.connections = CONCAT(u.connections, ?2) WHERE u.userId = ?1")
    void addConnection(UUID userId, UUID connectionId);
}







