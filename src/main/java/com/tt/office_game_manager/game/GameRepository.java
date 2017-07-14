package com.tt.office_game_manager.game;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Tadeusz on 2017-07-12.
 */
@Repository
public interface GameRepository extends JpaRepository<GameEntity, Long> {
}
