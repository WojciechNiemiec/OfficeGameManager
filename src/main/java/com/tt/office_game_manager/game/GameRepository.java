package com.tt.office_game_manager.game;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Tadeusz on 2017-07-12.
 */
@Repository
public interface GameRepository extends CrudRepository<GameEntity, Long> {
}
