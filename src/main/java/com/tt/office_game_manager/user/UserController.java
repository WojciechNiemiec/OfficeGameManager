package com.tt.office_game_manager.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jereczekt on 11.07.2017.
 */
@Controller
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @Autowired
    UserController(UserService userService) {
        super();
        this.userService = userService;
    }

    @PostMapping("/create")
    @ResponseBody
    public void addUser(@RequestBody UserEntity userEntity) {
        userService.addUser(userEntity);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public UserEntity getUser(@PathVariable("id") Long id) {
        return userService.getUser(id);
    }

    @GetMapping("/")
    @ResponseBody
    public Iterable<UserEntity> getAllUsers() {
        return userService.getAllUsers();
    }

    @PutMapping("/update")
    @ResponseBody
    public void updateUser(@RequestBody UserEntity userEntity) {
        userService.updateUser(userEntity);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public void deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public void deleteUser(@RequestBody UserEntity userEntity) {
        userService.deleteUser(userEntity);
    }
}
