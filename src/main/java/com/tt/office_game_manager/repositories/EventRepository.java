package com.tt.office_game_manager.repositories;

import com.tt.office_game_manager.entities.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by niemiecw on 11.07.2017.
 */

@Repository
public interface EventRepository extends CrudRepository<Event, Long> {
    Event findByEventId(Long eventId);
    Collection<Event> findAll();
}