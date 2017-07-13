package com.tt.office_game_manager.score;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tt.office_game_manager.game.GameEntity;
import com.tt.office_game_manager.team.TeamEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Tadeusz on 2017-07-12.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
public class ScoreId implements Serializable{
    @SuppressWarnings("JpaAttributeTypeInspection")
    @ManyToOne
    @JoinColumn(name = "game_id")
    @JsonIgnore
    private GameEntity gameEntity;

    @SuppressWarnings("JpaAttributeTypeInspection")
    @ManyToOne
    @JoinColumn(name = "team_id")
    private TeamEntity teamEntity;
}
