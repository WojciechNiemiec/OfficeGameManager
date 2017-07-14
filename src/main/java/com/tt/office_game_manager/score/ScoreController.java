package com.tt.office_game_manager.score;

import com.tt.office_game_manager.team.TeamEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Tadeusz on 2017-07-12.
 */
@Controller
@RequestMapping("scores")
public class ScoreController {
    private final ScoreService scoreService;

    @Autowired
    public ScoreController(ScoreService scoreService) {
        this.scoreService = scoreService;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public void addScore(@RequestBody ScoreEntity scoreEntity) {
        scoreService.addScore(scoreEntity);
    }

    @RequestMapping("/{id}")
    @ResponseBody
    public ScoreEntity getScore(@PathVariable("id") ScoreId id) {
        return scoreService.getScore(id);
    }

    @RequestMapping("/")
    @ResponseBody
    public Iterable<ScoreEntity> getScores() {
        return scoreService.getAllScores();
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    @ResponseBody
    public void updateScore(@RequestBody ScoreEntity scoreEntity) {
        scoreService.addScore(scoreEntity);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteScore(@RequestBody ScoreEntity scoreEntity) {
        scoreService.deleteScore(scoreEntity);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteScore(@PathVariable ScoreId id) {
        scoreService.deleteScore(id);
    }
}
