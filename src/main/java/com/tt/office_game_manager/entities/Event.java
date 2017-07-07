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
@EqualsAndHashCode
@ToString
@Entity
public class Event implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventId;
    @Enumerated(EnumType.STRING)
    private Discipline discipline;
    @ManyToOne
    @JoinColumn(name="userId")
    private User owner;
    private Date beginDate;
    private Date endDate;
    private Boolean isRanked;
    private Boolean isTournament;
}
