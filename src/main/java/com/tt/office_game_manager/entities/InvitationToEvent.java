package com.tt.office_game_manager.entities;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Created by niemiecw on 07.07.2017.
 */
public class InvitationToEvent extends Invitation{

    @ManyToOne
    @JoinColumn(name = "teamId")
    private Team team;
    @ManyToOne
    @JoinColumn(name = "eventId")
    private Event event; //invitatedUser
}
