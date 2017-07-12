package com.tt.office_game_manager.invitation.invitation_to_team;

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
    public List<InvitationEntityToTeamEntity> getInvitationsToTeam(){
        List<InvitationEntityToTeamEntity> invitationToTeamEntities = new ArrayList<>();
        invitationToTeamService.getAllInvitationToTeam().forEach(invitationToTeamEntities::add);
        return invitationToTeamEntities;
    }

}
