package com.tt.office_game_manager.repositories;

import com.tt.office_game_manager.entities.InvitationToTeam;
import com.tt.office_game_manager.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by jereczekt on 11.07.2017.
 */
@Repository
public interface InvitationToTeamRepository extends CrudRepository<InvitationToTeam, Long> {
    List<InvitationToTeam> findAllByUser(User user);
}
