# SOAP to SOAP Template

[![forthebadge made-with-spring-boot](https://img.shields.io/badge/made_with-Spring_Boot-6DB33F?labelColor=fff&style=for-the-badge&logo=spring-boot&logoColor=6DB33F)](https://spring.io/projects/spring-boot)
[![forthebadge uses-java](https://img.shields.io/badge/uses-Java-007396?labelColor=fff&style=for-the-badge&logo=java&logoColor=007396)](https://www.java.com/)
[![forthebadge uses-maven](https://img.shields.io/badge/uses-Maven-C71A36?labelColor=fff&style=for-the-badge&logo=apache-maven&logoColor=C71A36)](https://maven.apache.org/)
[![forthebadge uses-docker](https://img.shields.io/badge/uses-Docker-2496ED?labelColor=fff&style=for-the-badge&logo=docker&logoColor=2496ED)](https://www.docker.com/)

SOAP to SOAP service template using Spring Boot

## Table of Contents

- [Overview](#overview)
- [Tech Stack](#tech-stack)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
    - [Setup](#setup)
- [Project Modules](#project-modules)
    - [Client](#client)
    - [Config](#config)
    - [Endpoint](#endpoint)
    - [Model](#model)
    - [Services](#services)
    - [WSDL](#wsdl)
- [Project Structure](#project-structure)

## Overview

This is a template for creating a SOAP to SOAP service using Spring Boot. It includes a set of pre-configured tools and
libraries to help you get started quickly with best practices and a scalable project structure. The template is designed
to be easy to customize and extend for various types of projects.

## Tech Stack

- **Server:** Spring Boot
- **Build Tool:** Maven
- **Programming Language:** Java 17
- **Containerization:** Docker

## Prerequisites

- Java (>= 17) [Java 17 JDK](https://openjdk.java.net/projects/jdk/17)
- Maven (>= 3.6.0) [Maven](https://maven.apache.org/download.cgi)


## Getting Started
### Setup

1. Clone the repository:
    ```bash
    git clone <repository_url>
    cd soap-services
    ```

2. Build the project:
    ```bash
    mvn clean install
    ```

3. Run the application:
    ```bash
    mvn spring-boot:run
    ```

## Project Modules

### Client
Contains the client configuration to call external services.

### Config
Includes the configuration classes for the SOAP service.

### Endpoint
Houses the endpoint definitions for the SOAP service.

### Model
Contains the data models used in the application.

### Services
Includes the service classes with the business logic.

### WSDL
Contains the WSDL files defining the SOAP services.



## Project Structure

```plaintext
soap-services/
├── .git/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── soap/
│   │   │           └── soap_services/
│   │   │               ├── client/
│   │   │               │   └── RealtimeClient.java
│   │   │               ├── config/
│   │   │               │   ├── MyRequest.java
│   │   │               │   ├── MyResponse.java
│   │   │               │   └── SoapConfig.java
│   │   │               ├── endpoint/
│   │   │               │   └── MySoapEndpoint.java
│   │   │               ├── model/
│   │   │               │   └── SubmitRequest.java
│   │   │               ├── services/
│   │   │               │   ├── MySoapService.java
│   │   │               │   └── RealtimeService.java
│   │   │               └── submitrequestresponse/
│   │   │                   └── SubmitRequestResponse.java
│   │   └── resources/
│   │       ├── wsdl/
│   │       │   ├── my-service.wsdl
│   │       │   └── realtime.wsdl
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/
│               └── soap/
│                   └── soap_services/
│                       └── SoapServicesApplicationTests.java
├── target/
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
