package com.tt.office_game_manager.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jereczekt on 11.07.2017.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @Autowired
    UserController(UserService userService) {
        super();
        this.userService = userService;
    }

    @RequestMapping("/{userId}")
    @ResponseBody
    public UserEntity getUser(@PathVariable("userId") Long userId) {
        return userService.getOneUser(userId);
    }

    @RequestMapping("/")
    @ResponseBody
    public List<UserEntity> getUsers() {
        List<UserEntity> userEntities = new ArrayList<>();
        userService.getAllUsers().forEach(userEntities::add);
        return userEntities;
    }
}
