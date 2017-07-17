package com.tt.office_game_manager.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by jereczekt on 10.07.2017.
 */
@Service
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Autowired
    public UserService(UserRepository userRepository, UserMapper userMapper) {
        super();
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public void addUser(UserEntity userEntity) {
        userRepository.save(userEntity);
    }

    public UserDTO getUser(Long id) {
        return userMapper.userEntityToUserDTO(userRepository.findOne(id));
    }

    public Iterable<UserDTO> getAllUsers() {
        Set<UserDTO> userDTOS = new HashSet<>();
        userRepository.findAll().stream().forEach(e->userDTOS.add(userMapper.userEntityToUserDTO(e)));
        return userDTOS;
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
