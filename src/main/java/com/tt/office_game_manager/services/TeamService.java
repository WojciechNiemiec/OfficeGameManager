package com.tt.office_game_manager.services;

import com.tt.office_game_manager.entities.Team;
import com.tt.office_game_manager.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by niemiecw on 11.07.2017.
 */

@Service
public class TeamService {
    private final TeamRepository teamRepository;

    @Autowired
    public TeamService(TeamRepository teamRepository) {
        super();
        this.teamRepository = teamRepository;
    }

    public List<Team> getAllTeams() {
        List<Team> teams = new ArrayList<>();
        teamRepository.findAll().forEach(team -> teams.add(team));
        return teams;
    }

    public Team getTeam(Long teamId) {
        return teamRepository.findOne(teamId);
    }

    public void addTeam(Team team) {
        teamRepository.save(team);
    }
}
