package org.iths.repzillabe.user.mapper;

import org.iths.repzillabe.user.dto.UserRequestDTO;
import org.iths.repzillabe.user.dto.UserResponseDTO;
import org.iths.repzillabe.user.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toEntity(UserRequestDTO user);

    UserResponseDTO toDTO(User user);
}
