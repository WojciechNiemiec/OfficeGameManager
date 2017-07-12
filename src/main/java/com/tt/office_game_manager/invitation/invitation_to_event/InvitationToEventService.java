package com.tt.office_game_manager.invitation.invitation_to_event;

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
    public List<InvitationToEventEntity> getAllInvitationToEvent(){
        List<InvitationToEventEntity> invitationToEventEntities = new ArrayList<>();
        invitationToEventEntities.forEach(invitationToEventEntities::add);
        return invitationToEventEntities;
    }
}
