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

student-management/\
│-- src/main/java/com/example/studentmanagement\
│&nbsp;&nbsp;&nbsp;│-- model/&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;# Contains entity classes\
│&nbsp;&nbsp;&nbsp;│-- dto/&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;# Data Transfer Objects\
│&nbsp;&nbsp;&nbsp;│-- repository/&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;# MongoDB repository interfaces\
│&nbsp;&nbsp;&nbsp;│-- service/&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;# Business logic layer\
│&nbsp;&nbsp;&nbsp;│-- controller/&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;# REST API controllers\
│&nbsp;&nbsp;&nbsp;│-- config/&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;# MongoDB configurations\
│-- src/main/resources/\
│&nbsp;&nbsp;&nbsp;│-- application.properties  # Configuration file\
│-- pom.xml               # Maven dependencies

