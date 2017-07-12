package com.tt.office_game_manager.invitation.invitation_to_event;

import com.tt.office_game_manager.event.EventEntity;
import com.tt.office_game_manager.invitation.InvitationEntity;
import com.tt.office_game_manager.team.TeamEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Created by niemiecw on 07.07.2017.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "invitation_to_event")
public class InvitationToEventEntity extends InvitationEntity {

    @ManyToOne
    @JoinColumn(name = "team_id")
    private TeamEntity teamEntity;
    @ManyToOne
    @JoinColumn(name = "event_id")
    private EventEntity eventEntity;
}
