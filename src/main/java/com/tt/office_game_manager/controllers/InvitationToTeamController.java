package com.tt.office_game_manager.controllers;

import com.tt.office_game_manager.entities.InvitationToTeam;
import com.tt.office_game_manager.services.InvitationToTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jereczekt on 11.07.2017.
 */
@Controller
@RequestMapping("/invitation-to-team")
public class InvitationToTeamController {
    private final InvitationToTeamService invitationToTeamService;

    @Autowired
    InvitationToTeamController(InvitationToTeamService invitationToTeamService) {
        super();
        this.invitationToTeamService = invitationToTeamService;
    }

    @RequestMapping("/")
    public List<InvitationToTeam> getInvitationsToTeam(){
        List<InvitationToTeam> invitationToTeams = new ArrayList<>();
        invitationToTeamService.getAllInvitationToTeam().forEach(invitationToTeams::add);
        return invitationToTeams;
    }

}
