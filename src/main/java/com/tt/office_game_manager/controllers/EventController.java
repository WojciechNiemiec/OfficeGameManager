package com.tt.office_game_manager.controllers;

import com.tt.office_game_manager.entities.Event;
import com.tt.office_game_manager.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

/**
 * Created by niemiecw on 11.07.2017.
 */

@Controller
@RequestMapping("/evemts")
public class EventController {
    private final EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        super();
        this.eventService = eventService;
    }

    @RequestMapping("/{eventId}")
    public Event getEvent(@PathVariable("eventId") Long eventId) {
        return eventService.getEvent(eventId);
    }

    @RequestMapping("/")
    public Collection<Event> getEvents() {
        return eventService.getAllEvents();
    }
}
