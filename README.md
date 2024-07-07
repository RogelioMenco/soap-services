# SOAP to SOAP Template

[![forthebadge made-with-spring-boot](https://img.shields.io/badge/made_with-Spring_Boot-6DB33F?labelColor=fff&style=for-the-badge&logo=spring-boot&logoColor=6DB33F)](https://spring.io/projects/spring-boot)
[![forthebadge uses-java](https://img.shields.io/badge/uses-Java-007396?labelColor=fff&style=for-the-badge&logo=java&logoColor=007396)](https://www.java.com/)
[![forthebadge uses-maven](https://img.shields.io/badge/uses-Maven-C71A36?labelColor=fff&style=for-the-badge&logo=apache-maven&logoColor=C71A36)](https://maven.apache.org/)
[![forthebadge uses-docker](https://img.shields.io/badge/uses-Docker-2496ED?labelColor=fff&style=for-the-badge&logo=docker&logoColor=2496ED)](https://www.docker.com/)

SOAP to SOAP service template using Spring Boot

- **Project Status:** In early development.

## Table of Contents

- [Overview](#overview)
- [Tech Stack](#tech-stack)
- [Prerequisites](#prerequisites)
- [Setup and Running](#setup-and-running)
    - [Navigate within the project directory](#navigate-within-the-project-directory)
    - [Build the project](#build-the-project)
    - [Running the server](#running-the-server)
    - [Running with Docker](#running-with-docker)
    - [Deploying to AKS](#deploying-to-aks)

## Overview

This is a template for creating a SOAP to SOAP service using Spring Boot. It includes a set of pre-configured tools and
libraries to help you get started quickly with best practices and a scalable project structure. The template is designed
to be easy to customize and extend for various types of projects.

## Tech Stack

- **Server:** Spring Boot
- **Build Tool:** Maven
- **Programming Language:** Java 22
- **Containerization:** Docker

## Prerequisites

- Java (>= 17) [Java 22 JDK](https://openjdk.java.net/projects/jdk/22/)
- Maven (>= 3.6.0) [Maven](https://maven.apache.org/download.cgi)
- Docker (>= 20.10.7) [Docker](https://www.docker.com/get-docker)

## Setup and Running

### Navigate within the project directory

```sh
cd soap-service
mvn clean install
