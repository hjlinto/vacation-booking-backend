# 🏝️ Vacation Booking Back-End System

A Java Spring Boot RESTful back-end developed for a vacation booking platform. This application serves as the server-side component of a fictional travel agency's booking system and integrates with a pre-built Angular front-end and a MySQL database.

The project modernizes legacy back-end functionality by implementing a modular, scalable, and database-driven solution using the Spring framework.

---

## Features

- RESTful API for customer vacation bookings
- Entity modeling for customers, vacations, excursions, carts, and locations
- Checkout system with POST endpoint for placing orders
- Custom service layer with response tracking
- Input validation for front-end form compatibility
- CORS configuration for Angular integration
- Sample data preloaded at runtime

---

## Developer Contributions

This project was based on a starter structure and expanded to include:

- Entity classes and enums designed from UML and ERD specifications
- Repositories with Spring Data JPA and CORS support
- Service layer implementing checkout logic and response DTOs
- REST controller for placing customer orders
- Input validation logic for required fields
- Seed data for five sample customers on application start
- Full integration testing using an unmodified Angular front-end

All development followed Git version control practices.

---

## Technologies Used

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **REST Repositories**
- **MySQL**
- **Lombok**
- **Thymeleaf**

---

## Project Structure

```
src/
├── main/
│   ├── java/com/example/demo/
│   │   ├── bootstrap/            # Loads initial customer data
│   │   ├── config/               # REST configuration (CORS, exposure)
│   │   ├── controllers/          # REST controller for checkout process
│   │   ├── dao/                  # Repositories for entity persistence
│   │   ├── entities/             # Domain models: Customer, Vacation, Cart, etc.
│   │   └── services/             # Business logic for checkout and orders
│   └── resources/
│       └── application.properties  # Database connection and JPA config
├── test/
│   └── java/com/example/demo/    # Spring Boot test scaffolding
```


---

## Usage Instructions

### Prerequisites
- Java 17+
- Maven
- MySQL Server

### Setup

1. Clone the repository:
```bash
git clone https://github.com/yourusername/d288-vacation-booking-backend.git
```
2. Run the application:
```bash
./mvnw spring-boot:run
```
3. Open browser and go to:
   http://localhost:8080/

---

## Reflections
- One future improvement I would focus on is enhancing the checkout experience by leveraging external APIs to support multiple payment methods, confirmation emails, and order history tracking.

---

## Author
Created by: Hunter J Linton
