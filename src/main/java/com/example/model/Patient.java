package com.example.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String pin;

    private String name;

    private boolean hasInsurance;

    @ManyToOne
    private GP gp;

    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointments;

}
