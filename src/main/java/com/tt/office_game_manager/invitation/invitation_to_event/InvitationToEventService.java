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
    InvitationToEventService(InvitationToEventRepository invitationToEventRepository) {
        super();
        this.invitationToEventRepository = invitationToEventRepository;
    }

    public void addInvitationToEvent(InvitationToEventEntity invitationToEventEntity) {
        invitationToEventRepository.save(invitationToEventEntity);
    }

    public InvitationToEventEntity getInvitationToEvent(Long id) {
        return invitationToEventRepository.findOne(id);
    }

    public Iterable<InvitationToEventEntity> getAllInvitationToEvent() {
        return invitationToEventRepository.findAll();
    }

    public void updateInvitationToEvent(InvitationToEventEntity invitationToEventEntity) {
        invitationToEventRepository.save(invitationToEventEntity);
    }

    public void deleteInvitationToEvent(Long id) {
        invitationToEventRepository.delete(id);
    }

    public void deleteInvitationToEvent(InvitationToEventEntity invitationToEventEntity) {
        invitationToEventRepository.delete(invitationToEventEntity);
    }
}
