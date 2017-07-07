package com.tt.office_game_manager.entities;

import javax.persistence.*;

/**
 * Created by niemiecw on 07.07.2017.
 */
public class InvitationToTeam extends Invitation {

    @ManyToOne
    @JoinColumn(name = "teamId")
    private Team team;
    @ManyToOne
    @JoinColumn(name = "userId")
    private User user; //invitatedUser
}
