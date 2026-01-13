package com.example.SpringORMCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringORMCrud.model.Ticket;
import com.example.SpringORMCrud.repository.TicketRepository;

@Service
public class TicketService {
@Autowired
private TicketRepository repository;
public void saveTicket(Ticket ticket)
{
	repository.save(ticket);
}
public List<Ticket> getAllTickets()
{
	return repository.findAll();
}
public Ticket getTicketById(int id)
{
	return repository.findById(id).orElse(null);
}
public void deleteTicket(int id)
{
	repository.deleteById(id);
}
}
