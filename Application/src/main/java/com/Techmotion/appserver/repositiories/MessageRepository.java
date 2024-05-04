package com.Techmotion.appserver.repositiories;

import com.Techmotion.appserver.repositiories.model.MessageRecord;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface MessageRepository extends CrudRepository<MessageRecord, UUID> {

    List<MessageRecord> findBySenderAndReceiver (UUID sender, UUID receiver);
}
