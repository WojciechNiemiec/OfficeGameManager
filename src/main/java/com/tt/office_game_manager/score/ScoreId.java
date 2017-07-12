package com.tt.office_game_manager.score;

import com.tt.office_game_manager.game.GameEntity;
import com.tt.office_game_manager.team.TeamEntity;

import java.io.Serializable;

/**
 * Created by Tadeusz on 2017-07-12.
 */
class ScoreId implements Serializable{
    Long gameEntity;
    Long teamEntity;
}
