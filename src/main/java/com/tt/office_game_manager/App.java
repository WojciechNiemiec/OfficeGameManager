package com.tt.office_game_manager;

import com.tt.office_game_manager.entities.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

//        Set<User> users = new HashSet<>();
//        Set<Team> teams = new HashSet<>();
//
//        users.add(User.builder().userId(1l).login("wojtek").password("xyz").teams(new HashSet<>()).build());
//        users.add(User.builder().userId(2l).login("tadek").password("xyz").teams(new HashSet<>()).build());
//        users.add(User.builder().userId(3l).login("marcin").password("xyz").teams(new HashSet<>()).build());
//        users.add(User.builder().userId(4l).login("piotr").password("xyz").teams(new HashSet<>()).build());
//        users.add(User.builder().userId(5l).login("mateusz").password("xyz").teams(new HashSet<>()).build());
//        users.add(User.builder().userId(6l).login("jan").password("xyz").teams(new HashSet<>()).build());
//
//        teams.add(Team.builder().name("Minionki").build());
//        teams.add(Team.builder().name("Rakiety").build());
//
//        users.stream().filter(user -> user.getUserId() < 5).forEach(user -> user.getTeams().add(teams.stream().filter(team -> team.getName().equals("Minionki")).findAny().get()));
//        users.stream().filter(user -> user.getUserId() > 2).forEach(user -> user.getTeams().add(teams.stream().filter(team -> team.getName().equals("Rakiety")).findAny().get()));
//        users.stream().forEach(System.out::println);
//
//        users.forEach(user -> session.save(user));
//        teams.forEach(team -> session.save(team));

//        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
//        CriteriaQuery<User> query = criteriaBuilder.createQuery(User.class);
//
//        Root<User> userRoot = query.from(User.class);
//
//        TypedQuery<User> typedQuery = session.getEntityManagerFactory().createEntityManager().createQuery(query
//                .select(userRoot)
//                .where(criteriaBuilder.between(userRoot.get(User_.userId), 2L, 5L))
//                .distinct(true)
//        );
//
//        System.out.println(typedQuery.getResultList());

        InvitationToTeam invitation = new InvitationToTeam();
        invitation.setTeam((Team) session.createQuery("select t from Team t").list().get(0));

        session.save(invitation);

        transaction.commit();

        session.close();
        HibernateUtil.getSessionFactory().close();

        //TODO: Repository i serwisy do kazdej encji
    }
}
