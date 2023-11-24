package com.example.e_queue_booking.dao;


import com.example.e_queue_booking.models.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

}
