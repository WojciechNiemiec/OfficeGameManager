package com.tt.office_game_manager.services;

import com.tt.office_game_manager.entities.InvitationToTeam;
import com.tt.office_game_manager.repositories.InvitationToTeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jereczekt on 11.07.2017.
 */
@Service
public class InvitationToTeamService {
    private final InvitationToTeamRepository invitationToTeamRepository;

    @Autowired
    InvitationToTeamService(InvitationToTeamRepository invitationToTeamRepository){
        super();
        this.invitationToTeamRepository = invitationToTeamRepository;
    }

    public List<InvitationToTeam> getAllInvitationToTeam(){
        List<InvitationToTeam> invitationToTeams = new ArrayList<>();
        invitationToTeamRepository.findAll().forEach(invitationToTeams::add);
        return invitationToTeams;
    }
}
