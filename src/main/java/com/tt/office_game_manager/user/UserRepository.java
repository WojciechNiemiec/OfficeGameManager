package com.tt.office_game_manager.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jereczekt on 10.07.2017.
 */
@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
}
