package com.example.SpringORMCrud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ticket_booking")
public class Ticket {
	 @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String passengerName;
private String source;
private String destination;
private double price;
public Ticket(){
	
}
public Ticket(int id,String passengerName,String source,String destination,double price){
	this.id=id;
	this.passengerName=passengerName;
	this.source=source;
	this.destination=destination;
	this.price=price;
	
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPassengerName() {
	return passengerName;
}
public void setPassengerName(String passengerName) {
	this.passengerName = passengerName;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

}
