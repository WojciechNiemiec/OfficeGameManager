package com.tt.office_game_manager.controllers;

import com.tt.office_game_manager.entities.User;
import com.tt.office_game_manager.services.UserService;
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
    @Autowired
    UserService userService;

    @RequestMapping("/{id}")
    @ResponseBody
    public User findById(@PathVariable("id") Long id) {
        return userService.getOneUser(id);
    }

    @RequestMapping("/")
    @ResponseBody
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        userService.getAllUsers().forEach(users::add);
        return users;
    }
}
