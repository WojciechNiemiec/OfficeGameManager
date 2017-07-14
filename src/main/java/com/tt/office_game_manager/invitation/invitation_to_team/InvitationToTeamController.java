package com.tt.office_game_manager.invitation.invitation_to_team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jereczekt on 11.07.2017.
 */
@Controller
@RequestMapping("/invitations-to-team")
public class InvitationToTeamController {
    private final InvitationToTeamService invitationToTeamService;

    @Autowired
    InvitationToTeamController(InvitationToTeamService invitationToTeamService) {
        super();
        this.invitationToTeamService = invitationToTeamService;
    }

    @PostMapping("/create")
    @ResponseBody
    public void create(@RequestBody InvitationToTeamEntity invitationToTeamEntity) {
        invitationToTeamService.addInvitationToTeam(invitationToTeamEntity);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public InvitationToTeamEntity getInvitationToTeamUser(@PathVariable("id") Long id) {
        return invitationToTeamService.getInvitationToTeam(id);
    }

    @GetMapping("/")
    @ResponseBody
    public Iterable<InvitationToTeamEntity> getInvitationsToTeam() {
        return invitationToTeamService.getAllInvitationsToTeam();
    }

    @PutMapping("/update")
    @ResponseBody
    public void updateInvitationToTeam(@RequestBody InvitationToTeamEntity invitationToTeamEntity) {
        invitationToTeamService.updateInvitationToTeam(invitationToTeamEntity);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public void deleteInvitationToTeam(@PathVariable("id") Long id) {
        invitationToTeamService.deleteInvitationToTeam(id);
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public void deleteInvitationToTeam(@RequestBody InvitationToTeamEntity invitationToTeamEntity) {
        invitationToTeamService.deleteInvitationToTeam(invitationToTeamEntity);
    }
}
