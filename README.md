# Student Management System

## Overview

This is a Spring Boot and MongoDB-based Student Management System that allows users to perform CRUD operations on student data. The project is structured with DTOs, Services, Repositories, and Controllers following best practices.

## Features
- Add a new student
- Retrieve all students
- Get a student by ID
- Update student details
- Delete a student
- Use MongoDB for persistance
- Clean architecture with layers for models, services and controllers

## Technologies Used
- Java (Spring Boot)
- MongoDB (NoSQL Database)
- Spring Data MongoDB
- Lombok (for reducing boilerplate code)
- Maven (for dependency management)

## Project Structure

- student-management/
  - src/main/java/com/example/studentmanagement/
    - model/                  # Contains entity classes
    - dto/                    # Data Transfer Objects
    - repository/             # MongoDB repository interfaces
    - service/                # Business logic layer
    - controller/             # REST API controllers
    - config/                 # MongoDB configurations
  - src/main/resources/
    - application.properties  # Configuration file
  - ppom.xml                                    # Maven dependencies

## API Endpoints

| Method         | Endpoint               | Description               |
|----------------|------------------------|---------------------------|
| GET            | /students              | Get all students          |
| GET            | /students/{id}         | Get student by ID         |
| POST           | /students/addStudent   | Add a new student         |
| PUT            | /students/{id}         | Update a student          |
| DELETE         | /students/{id}         | Delete a student          |

## Author
Bojan Bozovic\
GitHub: [BBojan94](https://github.com/BBojan94)

