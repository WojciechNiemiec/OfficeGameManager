package com.tt.office_game_manager.team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by niemiecw on 11.07.2017.
 */

@Controller
@RequestMapping("/teams")
public class TeamController {
    private final TeamService teamService;

    @Autowired
    TeamController(TeamService teamService) {
        super();
        this.teamService = teamService;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public void addTeam(@RequestBody TeamEntity teamEntity) {
        teamService.addTeam(teamEntity);
    }

    @RequestMapping("/{id}")
    @ResponseBody
    public TeamEntity getTeam(@PathVariable("id") Long id) {
        return teamService.getTeam(id);
    }

    @RequestMapping("/")
    @ResponseBody
    public Iterable<TeamEntity> getTeams() {
        return teamService.getAllTeams();
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    @ResponseBody
    public void updateTeam(@RequestBody TeamEntity teamEntity) {
        teamService.addTeam(teamEntity);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteTeam(@RequestBody TeamEntity teamEntity) {
        teamService.deleteTeam(teamEntity);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteTeam(@PathVariable Long id) {
        teamService.deleteTeam(id);
    }
}
