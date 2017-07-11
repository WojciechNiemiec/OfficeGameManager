package com.tt.office_game_manager.controllers;

import com.tt.office_game_manager.entities.InvitationToEvent;
import com.tt.office_game_manager.services.InvitationToEventService;
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
@RequestMapping("/invitation-to-team")
public class InvitationToEventController {
    private final InvitationToEventService invitationToEventService;

    @Autowired
    InvitationToEventController(InvitationToEventService invitationToEventService) {
        super();
        this.invitationToEventService = invitationToEventService;
    }

    @RequestMapping("/")
    @ResponseBody
    public List<InvitationToEvent> getInvitationsToEvent() {
        List<InvitationToEvent> invitationToEvents = new ArrayList<>();
        invitationToEventService.getAllInvitationToEvent().forEach(invitationToEvents::add);
        return invitationToEvents;
    }


}
