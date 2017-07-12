package com.tt.office_game_manager.score;

import com.tt.office_game_manager.game.GameEntity;
import com.tt.office_game_manager.team.TeamEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by jereczekt on 12.07.2017.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@IdClass(ScoreId.class)
@Table(name = "score")
public class ScoreEntity implements Serializable{
    @Id
    @ManyToOne
    @JoinColumn(name = "game_id")
    private GameEntity gameEntity;

    @Id
    @ManyToOne
    @JoinColumn (name = "team_id")
    private TeamEntity teamEntity;

    @Column (name = "score")
    private Integer score;
}
