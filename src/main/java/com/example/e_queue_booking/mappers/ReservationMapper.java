package com.example.e_queue_booking.mappers;


import com.example.e_queue_booking.models.dtos.ReservationDto;
import com.example.e_queue_booking.models.entities.Reservation;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ReservationMapper {
    ReservationMapper INSTANCE = Mappers.getMapper(ReservationMapper.class);

    Reservation mapToReservation(ReservationDto reservationDto);

    ReservationDto mapToReservationDto(Reservation reservation);
}
