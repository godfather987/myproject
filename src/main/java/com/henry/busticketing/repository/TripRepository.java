package com.henry.busticketing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henry.busticketing.model.Trip;

public interface TripRepository extends JpaRepository<Trip, Long>{

}
