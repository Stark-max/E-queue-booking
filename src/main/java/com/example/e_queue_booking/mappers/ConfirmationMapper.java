package com.example.e_queue_booking.mappers;


import com.example.e_queue_booking.models.dtos.ConfirmationDto;
import com.example.e_queue_booking.models.entities.Confirmation;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ConfirmationMapper {
    ConfirmationMapper INSTANCE = Mappers.getMapper(ConfirmationMapper.class);
    Confirmation mapToConfirmation(ConfirmationDto confirmationDto);
    ConfirmationDto mapToConfirmationDto(Confirmation confirmation);

}
