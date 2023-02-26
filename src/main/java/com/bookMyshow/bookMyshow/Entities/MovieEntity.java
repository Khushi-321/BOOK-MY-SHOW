package com.bookMyshow.bookMyshow.Entities;

import com.bookMyshow.bookMyshow.ENUMS.GENRE;
import com.bookMyshow.bookMyshow.ENUMS.Language;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="Movie")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // making movie unique and not null
    @NonNull
    @Column(unique = true,nullable = false)
    private String movieName;

    private double rating;

    private int duration;

    @Enumerated(value = EnumType.STRING)
    private Language language;

    @Enumerated(value=EnumType.STRING)
    private GENRE genre;

    // This is parent with respect to show entity
    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    private List<ShowEntity> showEntityList= new ArrayList<>();




}
