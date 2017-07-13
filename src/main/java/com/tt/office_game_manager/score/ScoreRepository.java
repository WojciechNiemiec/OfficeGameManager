package com.tt.office_game_manager.score;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.swing.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * Created by Tadeusz on 2017-07-12.
 */
@Repository
public interface ScoreRepository extends CrudRepository<ScoreEntity, ScoreId> {
}
