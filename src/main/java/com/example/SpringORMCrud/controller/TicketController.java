package com.example.SpringORMCrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.SpringORMCrud.model.Ticket;
import com.example.SpringORMCrud.service.TicketService;

@Controller
public class TicketController {
@Autowired
private TicketService service;
@GetMapping("/")
public String listTickets(Model model) 
{
	model.addAttribute("tickets", service.getAllTickets());
	return "ticket-list";
}
@GetMapping("/add")
public String addForm(Model model) {
	model.addAttribute("ticket", new Ticket());
	return "ticket-form";
}
@PostMapping("/saveTicket")
public String saveTicket(@ModelAttribute Ticket ticket) {
	service.saveTicket(ticket);
	return "redirect:/";
}
@GetMapping("/edit/{id}")
public String editTicket(@PathVariable int id,Model model) {
	model.addAttribute("ticket",service.getTicketById(id));
	return "ticket-form";
}
@GetMapping("/delete/{id}")
public String deleteTicket(@PathVariable int id) {
	service.deleteTicket(id);

return "redirect:/";
}
}

