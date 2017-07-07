package com.tt.office_game_manager;

import com.tt.office_game_manager.entities.*;
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
                .addAnnotatedClass(Event.class)
                .addAnnotatedClass(InvitationToEvent.class)
                .addAnnotatedClass(InvitationToTeam.class)
                .addAnnotatedClass(Team.class)
                .addAnnotatedClass(TeamEvent.class)
                .addAnnotatedClass(User.class)
                .buildSessionFactory();
    }
}
