package com.tt.office_game_manager.invitation.invitation_to_team;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jereczekt on 11.07.2017.
 */
@Repository
public interface InvitationToTeamRepository extends CrudRepository<InvitationToTeamEntity, Long> {
}
