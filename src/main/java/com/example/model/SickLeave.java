package com.example.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity(name = "sick_leave")
public class SickLeave {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private LocalDate startDate;

    private LocalDate endDate;

    @OneToOne
    private Appointment appointment;
}
