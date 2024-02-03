# Members Application Microservice

This microservice is a part of the Gym Management System and is responsible for managing member profiles.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
- [API Documentation](#api-documentation)
- [Database Schema](#database-schema)
- [Configuration](#configuration)
- [Build and Run](#build-and-run)
- [Testing](#testing)
- [Deployment](#deployment)
- [Contributing](#contributing)
- [License](#license)

## Introduction

This microservice handles member profiles within the Gym Management System. It allows for the storage and retrieval of member details.

## Features

- **Member Profile Management:**
    - Create, read, update, and delete member profiles.
- **Notification:**
    - Send SMS notifications when membership is about to end.
- **Console Integration:**
    - Integrates with the gym management console.

## Technologies Used

- Java
- Spring Boot
- MySQL
- Twilio (for SMS notifications)
- (Add any other relevant technologies)

## Getting Started

To set up the Members Application Microservice locally, follow these steps:

### Prerequisites

- Java 17
- MySQL Database
- (Add any other prerequisites)

### Configuration

Update the `application.properties` file with your MySQL database details and Twilio API credentials.


## Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/gym_management
spring.datasource.username=your_database_username
spring.datasource.password=your_database_password


### API Documentation

http://localhost:8080/swagger-ui/index.html please use this url for swagger 

## Database Schema

### Tables

1. **members**
    - `member_id` (Primary Key, Auto-increment)
    - `first_name` (String)
    - `last_name` (String)
    - `email` (String)
    - `phone_number` (String)
    - `membership_start_date` (Date)
    - `membership_end_date` (Date)

2. **other_tables**
    - `column1` (Data Type)
    - `column2` (Data Type)
    - ...

### Relationships

- **Relationship 1**
    - Table: members
    - Foreign Key: foreign_key_column REFERENCES referenced_table(referenced_column)

- **Relationship 2**
    - Table: other_tables
    - Foreign Key: foreign_key_column REFERENCES referenced_table(referenced_column)

## Configuration

spring.datasource.url=jdbc:mysql://localhost:3306/gym_management
spring.datasource.username=your_database_username
spring.datasource.password=your_database_password

## Build and Run


### Prerequisites

Before you begin, ensure you have the following installed on your machine:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Apache Maven](https://maven.apache.org/download.cgi)
- [MySQL Database](https://www.mysql.com/downloads/) (or use an existing MySQL database)

### Build

To build the microservice, follow these steps:

1. Open a terminal and navigate to the project directory.

2. Run the following command to build the project:

   ```bash
   ./mvnw clean install

## Testing

work in progress 

## Deployment

work in progress

## Contributing

if interested to contribute please take a fork and after doing your changes Push the PR

## License

MIT Open Licence