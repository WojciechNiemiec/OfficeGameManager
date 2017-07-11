package com.tt.office_game_manager.repositories;

import com.tt.office_game_manager.entities.InvitationToEvent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jereczekt on 11.07.2017.
 */
@Repository
public interface InvitationToEventRepository extends CrudRepository<InvitationToEvent, Long> {
}
