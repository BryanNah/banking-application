# Banking Application with Spring Boot and Gradle

A simple banking application implemented using Spring Boot and built with Gradle that allows users to perform basic banking tasks such as checking account balances, making deposits, and withdrawing funds.

## Table of Contents

- [Features](#features)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
    - [Installation](#installation)
    - [Configuration](#configuration)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)

## Features

- Check account balance
- Make deposits
- Withdraw funds
- Get account information

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Make sure [Java](https://www.oracle.com/java/technologies/downloads/) 17 installed.
- [Spring Boot](https://spring.io/projects/spring-boot) - the application is built with Spring Boot.
- [Gradle](https://gradle.org/install/) 7 or higher installed.

## Getting Started

### Installation

Follow these steps to set up and run the application:

1. Clone the repository:

   ```sh
   git clone https://github.com/BryanNah/backend-stage-two-task

2. Navigate to the project directory:
   ```sh
   cd banking-application
   
### Configuration

Configure your application properties in src/main/resources/application.properties or src/main/resources/application.yml:

   ```yaml
    spring.datasource.url=jdbc:mysql://localhost:3306/banking_app
    spring.datasource.username=root
    spring.datasource.password=Mysql@123
    spring.jpa.hibernate.ddl-auto=update
   ``` 

## Usage

Run the application using the following command:

   ```sh
   ./gradlew bootRun
   ```

The application will be accessible at http://localhost:8000.

## API Endpoints

- Check Balance: GET /api/account/{accountId}/balance
- Deposit Funds: POST /api/account/{accountId}/deposit
- Withdraw Funds: POST /api/account/{accountId}/withdraw
- Get Account Information: GET /api/account/{accountId}