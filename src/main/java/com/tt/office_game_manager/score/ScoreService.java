package com.tt.office_game_manager.score;

import com.tt.office_game_manager.game.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tadeusz on 2017-07-12.
 */
@Service
public class ScoreService {
    private final ScoreRepository scoreRepository;

    @Autowired
    public ScoreService(ScoreRepository scoreRepository){
        super();
        this.scoreRepository=scoreRepository;
    }

    public void addScore(ScoreEntity scoreEntity){
        scoreRepository.save(scoreEntity);
    }

    public List<ScoreEntity> getAllScores(){
        List<ScoreEntity> scoreEntities=new ArrayList<>();
        scoreRepository.findAll().forEach(scoreEntities::add);
        return scoreEntities;
    }

}
