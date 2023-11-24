package com.example.e_queue_booking.mappers;


import com.example.e_queue_booking.models.dtos.UserDto;
import com.example.e_queue_booking.models.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    User mapToUser(UserDto userDto);
    UserDto mapToUserDto(User user);

}
