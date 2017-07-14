package com.tt.office_game_manager.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/create")
    @ResponseBody
    public void addEvent(@RequestBody EventEntity eventEntity) {
        eventService.addEvent(eventEntity);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public EventEntity getEvent(@PathVariable("id") Long id) {
        return eventService.getEvent(id);
    }

    @GetMapping("/")
    @ResponseBody
    public Collection<EventEntity> getEvents() {
        return eventService.getAllEvents();
    }

    @PutMapping("/update")
    @ResponseBody
    public void updateEvent(@RequestBody EventEntity eventEntity) {
        eventService.updateEvent(eventEntity);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public void deleteEvent(@PathVariable("id") Long id) {
        eventService.deleteEvent(id);
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public void deleteEvent(@RequestBody EventEntity eventEntity) {
        eventService.deleteEvent(eventEntity);
    }
}
