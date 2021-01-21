package com.henry.busticketing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henry.busticketing.model.Seat;

public interface SeatRepository extends JpaRepository<Seat, Long>{

}
