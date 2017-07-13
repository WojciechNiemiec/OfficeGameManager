package com.tt.office_game_manager.invitation.invitation_to_event;

import com.tt.office_game_manager.event.EventEntity;
import com.tt.office_game_manager.invitation.InvitationEntity;
import com.tt.office_game_manager.invitation.InvitationStatusType;
import com.tt.office_game_manager.team.TeamEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.sql.Date;

/**
 * Created by niemiecw on 07.07.2017.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "invitation_to_event")
public class InvitationToEventEntity extends InvitationEntity {

    public InvitationToEventEntity(Long id, InvitationStatusType invitationStatusType, Date date, TeamEntity teamEntity, EventEntity eventEntity) {
        super(id, invitationStatusType, date);
        this.teamEntity = teamEntity;
        this.eventEntity = eventEntity;
    }

    @ManyToOne
    @JoinColumn(name = "team_id")
    private TeamEntity teamEntity;
    @ManyToOne
    @JoinColumn(name = "event_id")
    private EventEntity eventEntity;
}
