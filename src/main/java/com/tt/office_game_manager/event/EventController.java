package com.tt.office_game_manager.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

/**
 * Created by niemiecw on 11.07.2017.
 */

@Controller
@RequestMapping("/events")
public class EventController {
    private final EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        super();
        this.eventService = eventService;
    }

    @RequestMapping("/{id}")
    public EventEntity getEvent(@PathVariable("id") Long id) {
        return eventService.getEvent(id);
    }

    @RequestMapping("/")
    public Collection<EventEntity> getEvents() {
        return eventService.getAllEvents();
    }
}
