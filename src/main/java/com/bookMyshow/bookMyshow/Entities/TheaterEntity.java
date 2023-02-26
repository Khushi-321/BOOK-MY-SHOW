package com.bookMyshow.bookMyshow.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Theater")
@Data
@NoArgsConstructor
public class TheaterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String location;

    // This is parent class with respect to theater seats
    @OneToMany(mappedBy = "theater", cascade = CascadeType.ALL)
    // List of theater seats in a theater entity
    private List<TheaterSeatEntity> theaterSeatEntityList= new ArrayList<>();

    // This is parent with respect to show entity
    @OneToMany(mappedBy = "theater", cascade = CascadeType.ALL)
    private List<ShowEntity> listOfShows= new ArrayList<>();



}
