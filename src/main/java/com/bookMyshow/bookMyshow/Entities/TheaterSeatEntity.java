package com.bookMyshow.bookMyshow.Entities;

import com.bookMyshow.bookMyshow.ENUMS.SeatType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name= "TheaterSeat")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TheaterSeatEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(value = EnumType.STRING)
    private SeatType seaType;

    private String seatNo;

    // connecting theater seat and theater
    @ManyToOne
    @JoinColumn
    private TheaterEntity theater;

}
