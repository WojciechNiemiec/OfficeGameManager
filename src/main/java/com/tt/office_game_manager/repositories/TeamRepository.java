package com.tt.office_game_manager.repositories;

import com.tt.office_game_manager.entities.Team;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by niemiecw on 11.07.2017.
 */

@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {

    Team findByTeamId(Long teamId);
}