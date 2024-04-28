package com.Techmotion.appserver.repositiories;

import com.Techmotion.appserver.repositiories.model.EventRecord;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface EventRepository extends CrudRepository <EventRecord, UUID> {

}
