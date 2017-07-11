package com.tt.office_game_manager.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Created by niemiecw on 07.07.2017.
 */

@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
public class InvitationToEvent extends Invitation{

    @ManyToOne
    @JoinColumn(name = "teamId")
    private Team team;
    @ManyToOne
    @JoinColumn(name = "eventId")
    private Event event;
}
