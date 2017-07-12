package com.tt.office_game_manager.invitation.invitation_to_event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jereczekt on 11.07.2017.
 */
@Controller
@RequestMapping("/invitation-to-event")
public class InvitationToEventController {
    private final InvitationToEventService invitationToEventService;

    @Autowired
    InvitationToEventController(InvitationToEventService invitationToEventService) {
        super();
        this.invitationToEventService = invitationToEventService;
    }

    @RequestMapping("/")
    @ResponseBody
    public List<InvitationToEventEntity> getInvitationsToEvent() {
        List<InvitationToEventEntity> invitationToEventEntities = new ArrayList<>();
        invitationToEventService.getAllInvitationToEvent().forEach(invitationToEventEntities::add);
        return invitationToEventEntities;
    }


}
