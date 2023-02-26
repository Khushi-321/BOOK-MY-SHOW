package com.bookMyshow.bookMyshow.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="User")
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    private String name;

    private int age;

    // marking this attribute is not null
    // Keeping email unique
    @Column(unique = true,nullable = false)
    private String email;
    // marking this attribute is not null
    @NonNull
    //Keeping the mobile number unique
    @Column(unique = true)
    private String mobile;

    private String address;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<TicketEntity> bookedTickets= new ArrayList<>();
}
