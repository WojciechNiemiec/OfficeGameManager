package com.tt.office_game_manager.score;

import com.tt.office_game_manager.match.MatchEntity;
import com.tt.office_game_manager.team.TeamEntity;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by jereczekt on 12.07.2017.
 */
@Data
@Entity
@Table(name = "score")
class ScoreEntity implements Serializable{
    @Id
    @ManyToOne
    @JoinColumn(name = "match_id")
    private MatchEntity matchEntity;
    @Id
    @ManyToOne
    @JoinColumn (name = "team_id")
    private TeamEntity teamEntity;
    @Column (name = "score")
    private Integer score;
}
