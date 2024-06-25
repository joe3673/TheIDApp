package com.Techmotion.appserver.service;

import com.Techmotion.appserver.repositiories.EventRepository;
import com.Techmotion.appserver.service.model.Event;
import com.Techmotion.appserver.service.model.Organization;

import java.time.LocalDateTime;

public class EventService {

    private EventRepository eventRepository;

    private OrganizationService organizationService;



    public EventService (EventRepository eventRepository, OrganizationService organizationService){
        this.eventRepository = eventRepository;
        this.organizationService = organizationService;
    }

    public Event createNewEvent(Organization organization, String eventName, String eventDescription,
                                LocalDateTime eventStartTime, LocalDateTime eventEndTime) {

        Long eventId = organization.getOrganizationId() + organization.getPastEvents().size();
        organization.addUpcomingEvent(eventId);
        organizationService.

        return new Event(eventId, organization.getOrganizationId(),eventName,eventDescription,
                organization.getOrganizationName(), eventStartTime, eventEndTime);

    }
}
