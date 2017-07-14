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
//@IdClass(ScoreId.class)
@Table(name = "score")
public class ScoreEntity implements Serializable{
    @EmbeddedId
    private ScoreId scoreId;

    @Column (name = "score")
    private Integer score;
}
