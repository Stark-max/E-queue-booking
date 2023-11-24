package com.example.e_queue_booking.models.entities;


import com.example.e_queue_booking.models.enums.Status;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "confirmations")
@Entity
public class Confirmation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToOne
    @JoinColumn(name = "reservation_id", unique = true)
    Reservation reservation;

    @Enumerated(EnumType.STRING)
    Status status;

    @CreationTimestamp
    Date confirmationDate;
}
