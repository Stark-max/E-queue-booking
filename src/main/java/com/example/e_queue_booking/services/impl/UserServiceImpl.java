package com.example.e_queue_booking.services.impl;

import com.example.e_queue_booking.dao.UserRepo;
import com.example.e_queue_booking.mappers.UserMapper;
import com.example.e_queue_booking.models.dtos.UserDto;
import com.example.e_queue_booking.models.entities.User;
import com.example.e_queue_booking.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;



    public ResponseEntity<?> createUser(UserDto userDto) {
        User user = UserMapper.INSTANCE.mapToUser(userDto);
        user = userRepo.save(user);
        return ResponseEntity.ok(UserMapper.INSTANCE.mapToUserDto(user));
    }

    public UserDto getUserById(Long userId) {
        Optional<User> userOptional = userRepo.findById(userId);
        return userOptional.map(UserMapper.INSTANCE::mapToUserDto).orElse(null);
    }

    public void updateUser(UserDto userDto) {
        User user = UserMapper.INSTANCE.mapToUser(userDto);
        userRepo.save(user);
    }

    public void deleteUser(Long userId) {
        userRepo.deleteById(userId);
    }
}

