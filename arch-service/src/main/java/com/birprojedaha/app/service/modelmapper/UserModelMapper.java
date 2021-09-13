package com.birprojedaha.app.service.modelmapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.birprojedaha.app.data.jdbc.model.User;
import com.birprojedaha.app.service.dto.UserDto;

@Mapper
public interface UserModelMapper {

	UserModelMapper INSTANCE = Mappers.getMapper(UserModelMapper.class);
	
	UserDto modelToDto(User model);
	User dtoToModel(UserDto dto);
}
