package com.tt.office_game_manager.user;

import org.mapstruct.Mapper;

/**
 * Created by Wojtek on 2017-07-15.
 */

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserEntity toUserEntity(UserDTO userDTO);
    UserDTO UserEntityToUserDTO(UserEntity userEntity);
}
