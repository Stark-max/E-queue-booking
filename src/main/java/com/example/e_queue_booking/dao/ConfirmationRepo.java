package com.example.e_queue_booking.dao;


import com.example.e_queue_booking.models.entities.Confirmation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConfirmationRepo extends JpaRepository<Confirmation, Long> {
}
