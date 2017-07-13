package com.tt.office_game_manager.invitation.invitation_to_team;

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

    public void addInvitationToTeam(InvitationToTeamEntity invitationToTeamEntity){
        invitationToTeamRepository.save(invitationToTeamEntity);
    }

    public List<InvitationToTeamEntity> getAllInvitationToTeam(){
        List<InvitationToTeamEntity> invitationToTeamEntities = new ArrayList<>();
        invitationToTeamRepository.findAll().forEach(invitationToTeamEntities::add);
        return invitationToTeamEntities;
    }
}
