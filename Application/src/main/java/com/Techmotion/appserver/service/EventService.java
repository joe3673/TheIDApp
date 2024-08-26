package com.Techmotion.appserver.service;

import com.Techmotion.appserver.exception.EventNotFoundException;
import com.Techmotion.appserver.repositiories.EventRepository;
import com.Techmotion.appserver.repositiories.model.EventRecord;
import com.Techmotion.appserver.service.model.Event;
import com.Techmotion.appserver.service.model.Organization;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.TransactionException;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Optional;

@Service
public class EventService {

    static final Logger log = LogManager.getLogger();
    private EventRepository eventRepository;

    private OrganizationService organizationService;



    public EventService (EventRepository eventRepository, OrganizationService organizationService){
        this.eventRepository = eventRepository;
        this.organizationService = organizationService;
    }


    public Event getEventById(Long eventID) {
        Objects.requireNonNull(eventID, "The id for the event must not be null.");
        EventRecord eventRecord = eventRepository.findById(eventID).orElseThrow(() -> new RuntimeException("No event found"));
        return convertRecordToEvent(eventRecord);
    }

    @Transactional
    public Event createEvent(Organization organization, String eventName, String eventDescription,
                             LocalDateTime eventStartTime, LocalDateTime eventEndTime) {
        Long eventId = organization.getOrganizationId() + organization.getPastEvents().size();
        try {
            Objects.requireNonNull(organization);

            organization.addUpcomingEvent(eventId);
            organizationService.updateOrganizationEvents(organization);

            EventRecord eventRecord = new EventRecord(eventId,organization.getOrganizationId(), eventName,
                    eventDescription,organization.getOrganizationLocation(),
                    organization.getOrganizationName(),eventStartTime,eventEndTime);

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
    @Transactional
    public Event updateEvent(Event event){
        Optional<EventRecord> eventOption = eventRepository.findById(event.getEventID());
        if(eventOption.isPresent()){
            EventRecord eventRecord = eventOption.get();
            eventRecord.setEventName(event.getEventName());
            eventRecord.setEventStartTime(event.getEventStartTime());
            eventRecord.setEventDescription(event.getEventDescription());
            eventRecord.setLocation(event.getLocation());

        }
        else {
            throw new EventNotFoundException("");
        }

        return event;

    }

    @Transactional
    public void deleteEventByID(Long eventID){
        Objects.requireNonNull(eventID, "Event Id can not be null.");

        try {
            eventRepository.deleteById(eventID);
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


    }



    private EventRecord convertEventToRecord(Event event){
        return new EventRecord(event.getEventID(), event.getHostingOrganizationID(), event.getEventName(),
                event.getEventDescription(),event.getLocation(),event.getHostingOrganizationName(),
                event.getEventStartTime(),event.getEventEndTime());
    }
    private Event convertRecordToEvent(EventRecord record){
        return new Event(record.getEventID(), record.getHostingOrganizationId(), record.getEventName(), record.getEventDescription(),
                record.getHostingOrganizationName(), record.getEventStartTime(), record.getEventEndTime());

    }
}
