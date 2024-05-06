package com.Techmotion.appserver.repositiories;

import com.Techmotion.appserver.repositiories.model.MessageRecord;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepository extends CrudRepository<MessageRecord, Long> {

    List<MessageRecord> findBySenderAndReceiver (Long sender, Long receiver);
}
