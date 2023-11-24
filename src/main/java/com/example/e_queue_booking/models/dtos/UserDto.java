package com.example.e_queue_booking.models.dtos;


import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserDto {
    Long id;
    String name;
    String surname;
    String middle_name;
    Integer INN;
    String phone_number;
    String photo;
}
