package com.tt.office_game_manager.score;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Tadeusz on 2017-07-12.
 */
@Controller
@RequestMapping("score")
public class ScoreController {
    private final ScoreService scoreService;

    @Autowired
    public ScoreController(ScoreService scoreService) {
        this.scoreService = scoreService;
    }

    @RequestMapping("/")
    @ResponseBody
    public List<ScoreEntity> getAllScores(){
        return scoreService.getAllScores();
    }
}
