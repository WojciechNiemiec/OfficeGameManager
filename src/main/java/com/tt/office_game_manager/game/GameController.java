package com.tt.office_game_manager.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
        super();
        this.gameService = gameService;
    }

    @PostMapping("/create")
    @ResponseBody
    public void addGame(@RequestBody GameEntity gameEntity) {
        gameService.addGame(gameEntity);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public GameEntity getGame(@PathVariable("id") Long id) {
        return gameService.getGame(id);
    }

    @GetMapping("/")
    @ResponseBody
    public List<GameEntity> getAllGames() {
        return gameService.getAllGames();
    }

    @PutMapping("/update")
    @ResponseBody
    public void updateGame(@RequestBody GameEntity gameEntity) {
        gameService.updateGame(gameEntity);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public void deleteGame(@PathVariable("id") Long id) {
        gameService.deleteGame(id);
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public void deleteGame(@RequestBody GameEntity gameEntity) {
        gameService.deleteGame(gameEntity);
    }
}
