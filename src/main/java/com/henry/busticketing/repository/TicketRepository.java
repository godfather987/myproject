package com.henry.busticketing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henry.busticketing.model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long>{

}
