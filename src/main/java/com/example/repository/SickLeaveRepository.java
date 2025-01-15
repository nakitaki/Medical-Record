package com.example.repository;

import com.example.model.SickLeave;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SickLeaveRepository extends JpaRepository<SickLeave, Long> {
}
