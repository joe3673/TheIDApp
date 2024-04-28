package com.Techmotion.appserver.repositiories;

import com.Techmotion.appserver.repositiories.model.MessageRecord;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface MessageRepository extends CrudRepository<MessageRecord, UUID> {
}
