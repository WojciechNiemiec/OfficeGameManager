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
    @Autowired
    UserRepository userRepository;

    public List<UserEntity> getAllUsers() {
        List<UserEntity> userEntities = new ArrayList<>();
        userRepository.findAll().forEach(userEntities::add);
        return userEntities;
    }

    public UserEntity getOneUser(Long id) {
        return userRepository.findOne(id);
    }

    public void addUser(UserEntity userEntity) {
        userRepository.save(userEntity);
    }

    public void updateUser(Long id, UserEntity userEntity) {
        userRepository.save(userEntity);
    }

    public void deleteUser(Long id) {
        userRepository.delete(id);
    }

}
