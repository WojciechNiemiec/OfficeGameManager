package com.tt.office_game_manager.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

/**
 * Created by niemiecw on 07.07.2017.
 */
@Getter
@Setter
@Builder
@EqualsAndHashCode
@ToString
@Entity
public class Team implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teamId;
    private String name;
    @ManyToOne
    @JoinColumn(name="userId")
    private User owner;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<User> users;
}
