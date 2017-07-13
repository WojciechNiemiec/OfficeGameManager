package com.tt.office_game_manager.team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
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

    public TeamEntity getTeam(Long id) {
        return teamRepository.findOne(id);
    }

    public Iterable<TeamEntity> getAllTeams() {
        return teamRepository.findAll();
    }

    public void addTeam(TeamEntity teamEntity) {
        teamRepository.save(teamEntity);
    }

    @Transactional
    public void addTeams(Collection<TeamEntity> teamEntities) {
        teamEntities.stream().forEach(teamRepository::save);
    }

    public void deleteTeam(Long id) {
        teamRepository.delete(id);
    }

    public void deleteTeam(TeamEntity teamEntity) {
        teamRepository.delete(teamEntity);
    }
}
