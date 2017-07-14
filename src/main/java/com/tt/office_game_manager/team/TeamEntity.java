package com.tt.office_game_manager.team;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tt.office_game_manager.invitation.invitation_to_event.InvitationToEventEntity;
import com.tt.office_game_manager.invitation.invitation_to_team.InvitationToTeamEntity;
import com.tt.office_game_manager.score.ScoreEntity;
import com.tt.office_game_manager.user.UserEntity;
import lombok.*;

import javax.persistence.*;
import javax.persistence.criteria.Join;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by niemiecw on 07.07.2017.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "team")
public class TeamEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private UserEntity owner;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_team", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "team_id", referencedColumnName = "id"))
    private Set<UserEntity> userEntities;

    @OneToMany
    @JoinColumn
    @JsonIgnore
    private Set<InvitationToEventEntity> invitationsToEvents;

    @OneToMany
    @JoinColumn
    @JsonIgnore
    private Set<ScoreEntity> scores;

    @OneToMany
    @JoinColumn
    @JsonIgnore
    private Set<InvitationToTeamEntity> ownedInvitationsToTeam;
}
