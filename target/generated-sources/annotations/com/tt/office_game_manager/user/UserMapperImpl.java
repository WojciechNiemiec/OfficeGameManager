package com.tt.office_game_manager.user;

import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2017-07-16T17:23:24+0200",
    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_121 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserEntity toUserEntity(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setId( userDTO.getId() );
        userEntity.setLogin( userDTO.getLogin() );
        userEntity.setPassword( userDTO.getPassword() );

        return userEntity;
    }

    @Override
    public UserDTO UserEntityToUserDTO(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( userEntity.getId() );
        userDTO.setLogin( userEntity.getLogin() );
        userDTO.setPassword( userEntity.getPassword() );

        return userDTO;
    }
}
