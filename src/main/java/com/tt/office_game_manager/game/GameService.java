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
        super();
        this.gameRepository = gameRepository;
    }

    public void addGame(GameEntity gameEntity) {
        gameRepository.save(gameEntity);
    }

    public GameEntity getGame(Long id) {
        return gameRepository.findOne(id);
    }

    public List<GameEntity> getAllGames() {
        return gameRepository.findAll();
    }

    public void updateGame(GameEntity gameEntity) {
        gameRepository.save(gameEntity);
    }

    public void deleteGame(Long id) {
        gameRepository.delete(id);
    }

    public void deleteGame(GameEntity gameEntity) {
        gameRepository.delete(gameEntity);
    }

}
