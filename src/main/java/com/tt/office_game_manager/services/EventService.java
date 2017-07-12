package com.tt.office_game_manager.services;

import com.tt.office_game_manager.entities.Event;
import com.tt.office_game_manager.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by niemiecw on 11.07.2017.
 */

@Service
public class EventService {

    private final EventRepository eventRepository;

    @Autowired
    public EventService(EventRepository eventRepository) {
        super();
        this.eventRepository = eventRepository;
    }

    public Event getEvent(Long eventId) {
        return eventRepository.findByEventId(eventId);
    }

    public List<Event> getAllEvents() {
        List<Event> events = new ArrayList<>();
        eventRepository.findAll().forEach(events::add);
        return  events;
    }
}
