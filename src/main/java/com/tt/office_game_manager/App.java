package com.tt.office_game_manager;

import com.tt.office_game_manager.entities.Team;
import com.tt.office_game_manager.entities.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        //createDatabase();
        SpringApplication.run(App.class, args);
    }

    private static void createDatabase() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Set<User> users = new HashSet<>();
        Set<Team> teams = new HashSet<>();

        users.add(User.builder().userId(1L).login("wojtek").password("xyz").teams(new HashSet<>()).build());
        users.add(User.builder().userId(1L).login("tadek").password("xyz").teams(new HashSet<>()).build());
        users.add(User.builder().userId(1L).login("marcin").password("xyz").teams(new HashSet<>()).build());
        users.add(User.builder().userId(1L).login("piotr").password("xyz").teams(new HashSet<>()).build());
        users.add(User.builder().userId(1L).login("mateusz").password("xyz").teams(new HashSet<>()).build());
        users.add(User.builder().userId(1L).login("jan").password("xyz").teams(new HashSet<>()).build());

        teams.add(Team.builder().name("Minionki").build());
        teams.add(Team.builder().name("Rakiety").build());

        users.stream().filter(user -> user.getUserId() < 5).forEach(user -> user.getTeams().add(teams.stream().filter(team -> team.getName().equals("Minionki")).findAny().get()));
        users.stream().filter(user -> user.getUserId() > 2).forEach(user -> user.getTeams().add(teams.stream().filter(team -> team.getName().equals("Rakiety")).findAny().get()));
        users.stream().forEach(System.out::println);

        users.forEach(user -> session.save(user));
        teams.forEach(team -> session.save(team));

        transaction.commit();

        session.close();
        HibernateUtil.getSessionFactory().close();
    }


}
