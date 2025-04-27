package com.notes.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.notes.dto.UserRequestDTO;
import com.notes.dto.UserResponseDTO;
import com.notes.entity.User;

@Mapper(componentModel = "spring")
public interface userMapper {

	userMapper INSTANCE = Mappers.getMapper(userMapper.class);

	User toEntity(UserRequestDTO dto);

	UserResponseDTO toResponseDTO(User entity);

}
