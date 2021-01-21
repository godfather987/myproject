package com.henry.busticketing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henry.busticketing.model.Bus;

public interface BusRepository extends JpaRepository<Bus, Long>{

}
