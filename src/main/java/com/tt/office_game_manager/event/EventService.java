package com.tt.office_game_manager.event;

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

    public void addEvent(EventEntity eventEntity) {
        eventRepository.save(eventEntity);
    }

    public EventEntity getEvent(Long id) {
        return eventRepository.findOne(id);
    }

    public List<EventEntity> getAllEvents() {
        return eventRepository.findAll();
    }

    public void updateEvent(EventEntity eventEntity) {
        eventRepository.save(eventEntity);
    }

    public void deleteEvent(Long id) {
        eventRepository.delete(id);
    }

    public void deleteEvent(EventEntity eventEntity) {
        eventRepository.delete(eventEntity);
    }
}
