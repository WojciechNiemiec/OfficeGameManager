package com.tt.office_game_manager.team;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by niemiecw on 11.07.2017.
 */

@Repository
public interface TeamRepository extends CrudRepository<TeamEntity, Long> {
}