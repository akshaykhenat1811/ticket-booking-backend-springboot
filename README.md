# Ticket Booking Backend - Spring Boot

This project is a Ticket Booking Backend Application developed using Spring Boot and Spring JDBC.
It provides complete CRUD functionality with REST APIs and an HTML-based user interface to manage tickets.

---

## Features
- Add new ticket
- Update existing ticket
- Delete ticket
- Retrieve all tickets
- Retrieve ticket by ID
- HTML list view with add, update, and delete options
- REST APIs using GET, POST, PUT, DELETE methods

---

## REST API Endpoints

| HTTP Method | Endpoint           | Description                |
|------------|--------------------|----------------------------|
| GET        | /tickets           | Get all tickets            |
| GET        | /ticket/{id}       | Get ticket by ID           |
| POST       | /addTicket         | Add new ticket             |
| PUT        | /updateTicket      | Update existing ticket     |
| DELETE     | /delete/{id}       | Delete ticket by ID        |

---

## HTML Functionality
- Display ticket list in HTML table
- HTML form to add ticket
- HTML form to update ticket
- Delete button for each ticket

---

## Tech Stack
- Java
- Spring Boot
- Spring JDBC
- Maven
- MySQL
- HTML
- CSS
- Git & GitHub

---

## Project Structure

---

## Database Structure

Table Name: ticket

| Column Name  | Data Type |
|-------------|-----------|
| id          | int (Primary Key) |
| name        | varchar |
| source      | varchar |
| destination | varchar |
| price       | double |

---

## How to Run the Project
1. Clone the repository
   git clone https://github.com/akshaykhenat1811/ticket-booking-backend-springboot.git
2. Open the project in Eclipse or IntelliJ
3. Configure database details in application.properties
4. Run the Spring Boot main application
5. Open browser to access HTML pages

---

## Learning Outcomes
- Spring Boot project configuration
- CRUD operations using Spring JDBC
- REST API development
- HTML integration with backend
- GitHub version control

---

## Author
Akshay Khenat


