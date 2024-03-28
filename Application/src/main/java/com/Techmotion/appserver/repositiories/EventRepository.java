package com.Techmotion.appserver.repositiories;

import com.Techmotion.appserver.repositiories.model.EventRecord;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository <EventRecord,String> {

}
