package com.tt.office_game_manager;

import com.tt.office_game_manager.event.EventEntity;
import com.tt.office_game_manager.invitation.invitation_to_event.InvitationEntityToEventEntity;
import com.tt.office_game_manager.invitation.invitation_to_team.InvitationEntityToTeamEntity;
import com.tt.office_game_manager.team.TeamEntity;
import com.tt.office_game_manager.user.UserEntity;
import lombok.Getter;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by niemiecw on 07.07.2017.
 */
public class HibernateUtil {
    @Getter
    private final static SessionFactory sessionFactory;

    static {
        sessionFactory = new Configuration().configure()
                .addAnnotatedClass(EventEntity.class)
                .addAnnotatedClass(InvitationEntityToEventEntity.class)
                .addAnnotatedClass(InvitationEntityToTeamEntity.class)
                .addAnnotatedClass(TeamEntity.class)
                .addAnnotatedClass(UserEntity.class)
                .buildSessionFactory();
    }
}
