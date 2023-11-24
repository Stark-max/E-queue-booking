package com.example.e_queue_booking.models.dtos;


import com.example.e_queue_booking.models.enums.Bank_service;
import com.example.e_queue_booking.models.enums.Branch;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ReservationDto {
    Long id;
    UserDto user;
    Bank_service service;
    Branch branch;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date date;

    @DateTimeFormat(pattern = "HH:mm:ss")
    Date time;
}
