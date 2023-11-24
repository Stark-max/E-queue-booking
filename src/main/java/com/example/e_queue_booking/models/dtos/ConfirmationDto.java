package com.example.e_queue_booking.models.dtos;


import com.example.e_queue_booking.models.enums.Status;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ConfirmationDto {
    Long id;
    ReservationDto reservation;
    Status status;
    Date confirmationDate;
}
