package com.tt.office_game_manager.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Tadeusz on 2017-07-12.
 */
@Service
public class GameService {
    private final GameRepository gameRepository;

    @Autowired
    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public void addGame(GameEntity gameEntity){
        gameRepository.save(gameEntity);
    }

    public GameEntity getGame(Long id){
        return gameRepository.findOne(id);
    }

    public List<GameEntity> getGames(){
        List<GameEntity> gameServices = new ArrayList<>();
        gameRepository.findAll().forEach(gameServices::add);
        return gameServices;
    }
}
