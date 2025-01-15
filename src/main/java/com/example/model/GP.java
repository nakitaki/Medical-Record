package com.example.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@Entity(name = "gp")
@EqualsAndHashCode(callSuper = true)
@DiscriminatorValue("GP")
public class GP extends Doctor{

    @OneToMany(mappedBy = "doctor")
    private List<Patient> patients;
}
