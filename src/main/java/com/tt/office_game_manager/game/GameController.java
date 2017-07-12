package com.tt.office_game_manager.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Tadeusz on 2017-07-12.
 */
@Controller
@RequestMapping("/game")
public class GameController {
    private final GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @RequestMapping("/")
    @ResponseBody
    public List<GameEntity> getAllGames(){
        return gameService.getGames();
    }

    @RequestMapping("/{id}")
    @ResponseBody
    public GameEntity getGame(@PathVariable("id") Long id) {
        return gameService.getGame(id);
    }
}
