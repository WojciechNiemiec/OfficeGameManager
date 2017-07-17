package com.tt.office_game_manager.user;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * Created by Wojtek on 2017-07-15.
 */

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {
    UserEntity userDTOToUserEntity(UserDTO userDTO);
    UserDTO userEntityToUserDTO(UserEntity userEntity);
}
