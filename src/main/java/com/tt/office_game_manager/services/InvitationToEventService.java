package com.tt.office_game_manager.services;

import com.tt.office_game_manager.entities.InvitationToEvent;
import com.tt.office_game_manager.repositories.InvitationToEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jereczekt on 11.07.2017.
 */
@Service
public class InvitationToEventService {
    private final InvitationToEventRepository invitationToEventRepository;

    @Autowired
    InvitationToEventService(InvitationToEventRepository invitationToEventRepository){
        super();
        this.invitationToEventRepository = invitationToEventRepository;
    }
    public List<InvitationToEvent> getAllInvitationToEvent(){
        List<InvitationToEvent> invitationToEvents = new ArrayList<>();
        invitationToEvents.forEach(invitationToEvents::add);
        return invitationToEvents;
    }
}
