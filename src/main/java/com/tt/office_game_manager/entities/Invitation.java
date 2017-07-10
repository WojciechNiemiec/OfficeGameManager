package com.tt.office_game_manager.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Invitation implements Serializable{

    @Id
    @GeneratedValue(strategy=GenerationType.TABLE)
    private Long invitationId;
    @Enumerated(EnumType.STRING)
    private InvitationStatus status;
    private Date date;
}