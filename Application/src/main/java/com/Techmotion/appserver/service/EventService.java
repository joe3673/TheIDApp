package com.Techmotion.appserver.service;

import com.Techmotion.appserver.repositiories.EventRepository;
import com.Techmotion.appserver.repositiories.model.EventRecord;
import com.Techmotion.appserver.service.model.Event;
import com.Techmotion.appserver.service.model.Organization;
import org.apache.logging.log4j.Logger;
import org.hibernate.TransactionException;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;

import java.time.LocalDateTime;
import java.util.Objects;
import org.apache.logging.log4j.LogManager;

import javax.transaction.Transactional;


public class EventService {

    static final Logger log = LogManager.getLogger();
    private EventRepository eventRepository;

    private OrganizationService organizationService;



    public EventService (EventRepository eventRepository, OrganizationService organizationService){
        this.eventRepository = eventRepository;
        this.organizationService = organizationService;
    }

    @Transactional
    public Event createEvent(Organization organization, String eventName, String eventDescription,
                             LocalDateTime eventStartTime, LocalDateTime eventEndTime) {
        Long eventId = organization.getOrganizationId() + organization.getPastEvents().size();
        try {
            Objects.requireNonNull(organization);

            organization.addUpcomingEvent(eventId);
            organizationService.updateOrganizationEvents(organization);

            EventRecord eventRecord = new EventRecord();
            eventRecord.setEventID(eventId);
            eventRecord.setEventName(eventName);
            eventRecord.setEventDescription(eventDescription);
            eventRecord.setEventStartTime(eventStartTime);
            eventRecord.setEventEndTime(eventEndTime);

            eventRepository.save(eventRecord);
        }
        catch (NullPointerException e) {
            log.error("A null value was encountered: " + e.getMessage());
        }
        catch (IllegalArgumentException e) {
            log.error("An argument is invalid: " + e.getMessage());
        }
        catch (DataAccessException e) {
            log.error("Database access error: " + e.getMessage());
        }
        catch (TransactionException e) {
            log.error("Transaction error: " + e.getMessage());
        }
        catch (Exception e) {
            log.error("An unexpected error occurred: " + e.getMessage());
        }

        return new Event(eventId, organization.getOrganizationId(),eventName,eventDescription,
                organization.getOrganizationName(), eventStartTime, eventEndTime);


    }

    public EventRecord convertEventToRecord()
}
