package com.tt.office_game_manager.controllers;

import com.tt.office_game_manager.entities.Team;
import com.tt.office_game_manager.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by niemiecw on 11.07.2017.
 */

@Controller
@RequestMapping(name = "/test")
public class TestController {

    @RequestMapping("/create-db")
    private void createDatabase() {
        Set<User> users = new HashSet<>();
        Set<Team> teams = new HashSet<>();

        users.add(User.builder().userId(1l).login("wojtek").password("xyz").teams(new HashSet<>()).build());
        users.add(User.builder().userId(2l).login("tadek").password("xyz").teams(new HashSet<>()).build());
        users.add(User.builder().userId(3l).login("marcin").password("xyz").teams(new HashSet<>()).build());
        users.add(User.builder().userId(4l).login("piotr").password("xyz").teams(new HashSet<>()).build());
        users.add(User.builder().userId(5l).login("mateusz").password("xyz").teams(new HashSet<>()).build());
        users.add(User.builder().userId(6l).login("jan").password("xyz").teams(new HashSet<>()).build());

        teams.add(Team.builder().name("Minionki").build());
        teams.add(Team.builder().name("Rakiety").build());

        users.stream().filter(user -> user.getUserId() < 5).forEach(user -> user.getTeams().add(teams.stream().filter(team -> team.getName().equals("Minionki")).findAny().get()));
        users.stream().filter(user -> user.getUserId() > 2).forEach(user -> user.getTeams().add(teams.stream().filter(team -> team.getName().equals("Rakiety")).findAny().get()));
        users.stream().forEach(System.out::println);
    }
}
