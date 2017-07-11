package com.tt.office_game_manager.controllers;

import com.tt.office_game_manager.entities.Team;
import com.tt.office_game_manager.entities.User;
import com.tt.office_game_manager.repositories.TeamRepository;
import com.tt.office_game_manager.repositories.UserRepository;
import com.tt.office_game_manager.services.TeamService;
import com.tt.office_game_manager.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by niemiecw on 11.07.2017.
 */

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    TeamService teamService;

    @Autowired
    UserService userService;

    @RequestMapping("/")
    @ResponseBody
    private void createDatabase() {
        Set<User> users = new HashSet<>();
        Set<Team> teams = new HashSet<>();

        users.add(User.builder().login("wojtek").password("xyz").teams(new HashSet<>()).build());
        users.add(User.builder().login("tadek").password("xyz").teams(new HashSet<>()).build());
        users.add(User.builder().login("marcin").password("xyz").teams(new HashSet<>()).build());
        users.add(User.builder().login("piotr").password("xyz").teams(new HashSet<>()).build());
        users.add(User.builder().login("mateusz").password("xyz").teams(new HashSet<>()).build());
        users.add(User.builder().login("jan").password("xyz").teams(new HashSet<>()).build());

        teams.add(Team.builder().name("Minionki").build());
        teams.add(Team.builder().name("Rakiety").build());

        users.stream().filter(user -> "wojtektadekmarcin".contains(user.getLogin())).forEach(user -> user.getTeams().add(teams.stream().filter(team -> team.getName().equals("Minionki")).findAny().get()));
        users.stream().filter(user -> "marcinpiotrmateuszjan".contains(user.getLogin())).forEach(user -> user.getTeams().add(teams.stream().filter(team -> team.getName().equals("Rakiety")).findAny().get()));
        users.stream().forEach(System.out::println);

        teamService.addTeams(teams);
        userService.addUsers(users);
    }
}
