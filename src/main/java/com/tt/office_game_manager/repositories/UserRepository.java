package com.tt.office_game_manager.repositories;

import com.tt.office_game_manager.entities.Team;
import com.tt.office_game_manager.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by jereczekt on 10.07.2017.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
