package com.tt.office_game_manager.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

/**
 * Created by niemiecw on 07.07.2017.
 */

@Getter
@Setter
@Entity
@EqualsAndHashCode
@ToString
public abstract class Invitation implements Serializable{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long invitationId;
    @Enumerated(EnumType.STRING)
    private InvitationStatus status;
    private Date date;
}