package com.example.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "treatment")
public class Treatment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    private String description;

    private String medicine;

    @ManyToOne
    private Appointment appointment;
}
