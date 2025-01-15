package com.example.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalTime;
import java.util.List;

@Data
@Entity(name = "appointment")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private LocalTime date;

    @OneToMany(mappedBy = "appointment")
    private List<Treatment> treatments;

    @ManyToMany
    @JoinTable(
            name = "diagnosis_appointment",
            joinColumns = @JoinColumn(name = "appointment_id"),
            inverseJoinColumns = @JoinColumn(name = "diagnosis_id")
    )
    private List<Diagnosis> diagnoses;

    @OneToOne
    @JoinColumn(name = "sick_leave_id", unique = true)
    private SickLeave sickLeave;

    @ManyToOne
    private Patient patient;

    @ManyToOne
    private Doctor doctor;

}
