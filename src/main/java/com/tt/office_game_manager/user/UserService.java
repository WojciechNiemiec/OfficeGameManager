package com.tt.office_game_manager.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by jereczekt on 10.07.2017.
 */
@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    public void addUser(UserEntity userEntity) {
        userRepository.save(userEntity);
    }

    public UserEntity getUser(Long id) {
        return userRepository.findOne(id);
    }

    public Iterable<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    public void updateUser(UserEntity userEntity) {
        userRepository.save(userEntity);
    }

    public void deleteUser(Long id) {
        userRepository.delete(id);
    }

    public void deleteUser(UserEntity userEntity) {
        userRepository.delete(userEntity);
    }
}
