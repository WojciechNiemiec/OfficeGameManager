package com.tt.office_game_manager.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by niemiecw on 07.07.2017.
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId")
    private Long userId;
    private String login;
    private String password;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "UserTeam", joinColumns = @JoinColumn(name = "userId"), inverseJoinColumns = @JoinColumn(name = "teamId"))
    private Set<Team> teams;
}
