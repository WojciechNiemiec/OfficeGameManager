package com.tt.office_game_manager.test_classes;

import com.tt.office_game_manager.event.EventEntity;
import com.tt.office_game_manager.event.EventService;
import com.tt.office_game_manager.invitation.invitation_to_event.InvitationToEventService;
import com.tt.office_game_manager.invitation.invitation_to_team.InvitationToTeamService;
import com.tt.office_game_manager.team.TeamEntity;
import com.tt.office_game_manager.user.UserEntity;
import com.tt.office_game_manager.team.TeamService;
import com.tt.office_game_manager.user.UserService;
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
    private TeamService teamService;

    @Autowired
    private UserService userService;

    @Autowired
    private InvitationToEventService invitationToEventService;

    @Autowired
    private InvitationToTeamService invitationToTeamService;

    @Autowired
    private EventService eventService;

    @RequestMapping //Yes we know it should be POST not GET
    @ResponseBody
    private void createDatabase() {
        Set<UserEntity> userEntities = new HashSet<>();
        Set<TeamEntity> teamEntities = new HashSet<>();

        userEntities.add(new UserEntity(null, "wojtek", "xyz", new HashSet<>()));
        userEntities.add(new UserEntity(null, "tadek", "xyz", new HashSet<>()));
        userEntities.add(new UserEntity(null, "rafal", "xyz", new HashSet<>()));
        userEntities.add(new UserEntity(null, "piotr", "xyz", new HashSet<>()));
        userEntities.add(new UserEntity(null, "michal", "xyz", new HashSet<>()));
        userEntities.add(new UserEntity(null, "brajan", "xyz", new HashSet<>()));
        userEntities.add(new UserEntity(null, "dzesika", "xyz", new HashSet<>()));

        teamEntities.add(new TeamEntity(null, "Minionki", null));
        teamEntities.add(new TeamEntity(null, "Rakiety", null));

        userEntities.stream().filter(user -> "wojtektadekmarcin".contains(user.getLogin())).forEach(user -> user.getTeamEntities().add(teamEntities.stream().filter(team -> team.getName().equals("Minionki")).findAny().get()));
        userEntities.stream().filter(user -> "marcinpiotrmateuszjan".contains(user.getLogin())).forEach(user -> user.getTeamEntities().add(teamEntities.stream().filter(team -> team.getName().equals("Rakiety")).findAny().get()));
        userEntities.stream().forEach(System.out::println);

        teamService.addTeams(teamEntities);
        userService.addUsers(userEntities);
    }
}
