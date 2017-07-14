package com.tt.office_game_manager.invitation.invitation_to_event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jereczekt on 11.07.2017.
 */
@Controller
@RequestMapping("/invitations-to-event")
public class InvitationToEventController {
    private final InvitationToEventService invitationToEventService;

    @Autowired
    InvitationToEventController(InvitationToEventService invitationToEventService) {
        super();
        this.invitationToEventService = invitationToEventService;
    }

    @PostMapping("/create")
    @ResponseBody
    public void addInvitationToEvent(@RequestBody InvitationToEventEntity invitationToEventEntity) {
        invitationToEventService.addInvitationToEvent(invitationToEventEntity);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public InvitationToEventEntity getInvitationToEvent(@PathVariable("id") Long id) {
        return invitationToEventService.getInvitationToEvent(id);
    }

    @GetMapping("/")
    @ResponseBody
    public Iterable<InvitationToEventEntity> getAllInvitationsToEvent() {
        return invitationToEventService.getAllInvitationToEvent();
    }

    @PutMapping("/update")
    @ResponseBody
    public void updateInvitationToEvent(@RequestBody InvitationToEventEntity invitationToEventEntity) {
        invitationToEventService.updateInvitationToEvent(invitationToEventEntity);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public void deleteInvitationToEvent(@PathVariable("id") Long id) {
        invitationToEventService.deleteInvitationToEvent(id);
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public void deleteInvitationToEvent(@RequestBody InvitationToEventEntity invitationToEventEntity) {
        invitationToEventService.deleteInvitationToEvent(invitationToEventEntity);
    }
}
