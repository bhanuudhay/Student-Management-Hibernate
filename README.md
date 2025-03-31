# Student-Management-Hibernate

A simple Student Management System using Hibernate and MySQL, demonstrating basic CRUD (Create, Read, Update, Delete) operations. This project is designed to help developers understand how Hibernate ORM works with Java and MySQL.

# Features
-  Add new students to the database
-  Retrieve student details using Hibernate
-  Update student information
-  Delete student records
-  Uses Hibernate ORM for database interaction
-  MySQL as the relational database

# Technologies Used

- **Java (JDK 17 - Corretto)**

- **Hibernate ORM (6.4.2.Final)**

- **MySQL (JDBC connection)**

- **Maven (for dependency management)**

# Setup & Usage

- Prerequisites

    - Make sure you have the following installed on your system:

      - Java 17 or later

      - MySQL Database

      - Maven

      - IntelliJ IDEA / Eclipse (Recommended for development)

# Steps to Run the Project

- Clone the repository:
````
git clone https://github.com/your-username/student-management-hibernate.git
cd student-management-hibernate
````
- Configure the database:

    - Open MySQL Workbench or Command Line and create a database:
    ````
    CREATE DATABASE student;
    ````

- Update hibernate.cfg.xml file with your MySQL credentials.

- Build & Run the Project:
````
mvn clean install
mvn exec:java
````

- Modify and test CRUD operations in Main.java.

# Future Enhancements

-  Add a REST API using Spring Boot

-  Implement a frontend using React or Angular

-  Improve exception handling and logging

**Feel free to contribute and improve it!**
