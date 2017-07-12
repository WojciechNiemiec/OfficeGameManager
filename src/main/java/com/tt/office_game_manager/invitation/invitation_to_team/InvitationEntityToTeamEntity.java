package com.tt.office_game_manager.invitation.invitation_to_team;

import com.tt.office_game_manager.invitation.InvitationEntity;
import com.tt.office_game_manager.team.TeamEntity;
import com.tt.office_game_manager.user.UserEntity;
import lombok.*;

import javax.persistence.*;

/**
 * Created by niemiecw on 07.07.2017.
 */

@Data
@Entity
@Table(name = "invitation_to_team")
public class InvitationEntityToTeamEntity extends InvitationEntity {

    @ManyToOne
    @JoinColumn(name = "team_id")
    private TeamEntity teamEntity;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;
}
