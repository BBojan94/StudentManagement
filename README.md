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
student-management/
│-- src/main/java/com/example/studentmanagement
│   │-- model/            # Contains entity classes
│   │-- dto/              # Data Transfer Objects
│   │-- repository/       # MongoDB repository interfaces
│   │-- service/          # Business logic layer
│   │-- controller/       # REST API controllers
│   │-- config/           # MongoDB configurations
│-- src/main/resources/
│   │-- application.properties  # Configuration file
│-- pom.xml               # Maven dependencies

.
 * [tree-md](./tree-md)
 * [dir2](./dir2)
   * [file21.ext](./dir2/file21.ext)
   * [file22.ext](./dir2/file22.ext)
   * [file23.ext](./dir2/file23.ext)
 * [dir1](./dir1)
   * [file11.ext](./dir1/file11.ext)
   * [file12.ext](./dir1/file12.ext)
 * [file_in_root.ext](./file_in_root.ext)
 * [README.md](./README.md)
 * [dir3](./dir3)
