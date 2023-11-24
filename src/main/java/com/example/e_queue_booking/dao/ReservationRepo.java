package com.example.e_queue_booking.dao;


import com.example.e_queue_booking.models.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepo extends JpaRepository<Reservation, Long> {
}
