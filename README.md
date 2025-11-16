# todo-api-java-mysql

A **TODO API** built with **Java 21 + Spring Boot + MySQL**

## Tech Stack
- Java 21
- Spring Boot 3
- Spring Data JPA (Hibernate)
- MySQL 8
- Maven

## Setup

1. Install **Java 21**, **MySQL**, and **Git**
2. Start MySQL and run:
   ```sql
   CREATE DATABASE todo_db;
   CREATE USER 'todo_user'@'localhost' IDENTIFIED BY 'todo123';
   GRANT ALL ON todo_db.* TO 'todo_user'@'localhost';



3. Checkout code: git clone https://github.com/your-username/todo-api-java-mysql.git
   cd todo-api-java-mysql
   Run the following to start the spring-boot app:
   ./mvnw spring-boot:run


