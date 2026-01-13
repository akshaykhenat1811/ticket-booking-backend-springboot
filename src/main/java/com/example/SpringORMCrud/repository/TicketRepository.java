package com.example.SpringORMCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringORMCrud.model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket,Integer>{

}
