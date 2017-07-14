package com.tt.office_game_manager.invitation.invitation_to_team;

import com.tt.office_game_manager.invitation.InvitationEntity;
import com.tt.office_game_manager.invitation.InvitationStatusType;
import com.tt.office_game_manager.team.TeamEntity;
import com.tt.office_game_manager.user.UserEntity;
import lombok.*;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by niemiecw on 07.07.2017.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "invitation_to_team")
public class InvitationToTeamEntity extends InvitationEntity {

    public InvitationToTeamEntity(Long id, InvitationStatusType invitationStatusType, Date date, TeamEntity teamEntity, UserEntity userEntity) {
        super(id, invitationStatusType, date);
        this.teamEntity = teamEntity;
        this.invitedUser = userEntity;
    }

    @ManyToOne
    @JoinColumn(name = "team_id")
    private TeamEntity teamEntity;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity invitedUser;
}
