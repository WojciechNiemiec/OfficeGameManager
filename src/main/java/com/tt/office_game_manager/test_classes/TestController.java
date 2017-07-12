package com.tt.office_game_manager.test_classes;

import com.tt.office_game_manager.discipline.DisciplineType;
import com.tt.office_game_manager.event.EventEntity;
import com.tt.office_game_manager.event.EventService;
import com.tt.office_game_manager.invitation.InvitationStatusType;
import com.tt.office_game_manager.invitation.invitation_to_event.InvitationToEventEntity;
import com.tt.office_game_manager.invitation.invitation_to_event.InvitationToEventService;
import com.tt.office_game_manager.invitation.invitation_to_team.InvitationToTeamEntity;
import com.tt.office_game_manager.invitation.invitation_to_team.InvitationToTeamService;
import com.tt.office_game_manager.team.TeamEntity;
import com.tt.office_game_manager.user.UserEntity;
import com.tt.office_game_manager.team.TeamService;
import com.tt.office_game_manager.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
        List<UserEntity> userEntities = new ArrayList<>();
        List<TeamEntity> teamEntities = new ArrayList<>();

        userEntities.add(new UserEntity(null, "wojtek", "xyz", new HashSet<>()));
        userEntities.add(new UserEntity(null, "tadek", "xyz", new HashSet<>()));
        userEntities.add(new UserEntity(null, "rafal", "xyz", new HashSet<>()));
        userEntities.add(new UserEntity(null, "piotr", "xyz", new HashSet<>()));
        userEntities.add(new UserEntity(null, "michal", "xyz", new HashSet<>()));
        userEntities.add(new UserEntity(null, "brajan", "xyz", new HashSet<>()));
        userEntities.add(new UserEntity(null, "dzesika", "xyz", new HashSet<>()));
        userEntities.stream().forEach(userService::addUser);

        teamEntities.add(new TeamEntity(null, "Minionki", null));
        teamEntities.add(new TeamEntity(null, "Rakiety", null));
        teamEntities.stream().forEach(teamService::addTeam);

        userEntities.stream().filter(user -> "wojtektadekmarcin".contains(user.getLogin())).forEach(user -> user.getTeamEntities().add(teamEntities.stream().filter(team -> team.getName().equals("Minionki")).findAny().get()));
        userEntities.stream().filter(user -> "marcinpiotrmateuszjan".contains(user.getLogin())).forEach(user -> user.getTeamEntities().add(teamEntities.stream().filter(team -> team.getName().equals("Rakiety")).findAny().get()));

        List<EventEntity> eventEntities = new ArrayList<>();
        eventEntities.add(new EventEntity(null, DisciplineType.DARTS, userEntities.get(0), null, null, true, false));
        eventEntities.add(new EventEntity(null, DisciplineType.TABLE_SOCCER, userEntities.get(2), null, null, false, false));
        eventEntities.add(new EventEntity(null, DisciplineType.TABLE_TENNIS, userEntities.get(3), null, null, true, true));
        eventEntities.stream().forEach(eventService::addEvent);


        List<InvitationToEventEntity> invitationToEventEntities = new ArrayList<>();
        invitationToEventEntities.add(new InvitationToEventEntity(null, InvitationStatusType.ACCEPTED, null, teamEntities.get(0), eventEntities.get(0)));
        invitationToEventEntities.add(new InvitationToEventEntity(null, InvitationStatusType.REJECTED, null, teamEntities.get(1), eventEntities.get(1)));
        invitationToEventEntities.stream().forEach(invitationToEventService::addInvitationToEvent);

        List<InvitationToTeamEntity> invitationToTeamEntities = new ArrayList<>();
        invitationToTeamEntities.add(new InvitationToTeamEntity(null, InvitationStatusType.REJECTED, null, teamEntities.get(1), userEntities.get(2)));
        invitationToTeamEntities.add(new InvitationToTeamEntity(null, InvitationStatusType.ACCEPTED, null, teamEntities.get(0), userEntities.get(1)));
        invitationToTeamEntities.stream().forEach(invitationToTeamService::addInvitationToTeam);
    }
}
