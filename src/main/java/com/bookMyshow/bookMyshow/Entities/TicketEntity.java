package com.bookMyshow.bookMyshow.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name="Ticket")
@Data
@NoArgsConstructor
public class TicketEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;


    private int totalAmount;

    private String movieName;

    private LocalTime showTime;

    private LocalDate showDate;

    private String ticketId= UUID.randomUUID().toString();

    private String theaterName;

    @ManyToOne
    @JoinColumn
    private UserEntity user;

    // This is child with respect to show entity
    @ManyToOne
    @JoinColumn
    private ShowEntity show;


}
