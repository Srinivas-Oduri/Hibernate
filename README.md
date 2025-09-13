# Hibernate Demo Project

This is a simple Java project demonstrating the use of Hibernate ORM for persisting Java objects to a MySQL database.

## Project Overview

The project uses Hibernate to map a `Student` entity to a MySQL database table. It includes a main application class that creates and saves a `Student` object using Hibernate's session and transaction management.

## Prerequisites

- Java Development Kit (JDK) 17 or higher
- Apache Maven 3.x
- MySQL Server running locally or accessible remotely

## Setup Instructions

1. **Database Setup**

   Create a MySQL database named `exter` (or update the database name in `hibernate.cfg.xml` accordingly):

   ```sql
   CREATE DATABASE exter;
   ```

2. **Configure Database Credentials**

   Update the database connection settings in `src/main/resources/hibernate.cfg.xml` if needed:

   ```xml
   <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/exter</property>
   <property name="hibernate.connection.username">root</property>
   <property name="hibernate.connection.password">your_password</property>
   ```

## Build and Run

1. Build the project using Maven:

   ```bash
   mvn clean install
   ```

2. Run the application:

   ```bash
   mvn exec:java -Dexec.mainClass="com.example.App"
   ```

   Alternatively, you can run the generated JAR file:

   ```bash
   java -jar target/hibernate-demo-1.0-SNAPSHOT.jar
   ```

## Project Structure

- `src/main/java/com/example/App.java` - Main application class demonstrating Hibernate usage.
- `src/main/java/com/example/model/Student.java` - JPA entity representing a student.
- `src/main/java/com/example/util/HibernateUtil.java` - Utility class for Hibernate `SessionFactory` setup.
- `src/main/resources/hibernate.cfg.xml` - Hibernate configuration file with database connection and mapping details.
- `pom.xml` - Maven project configuration and dependencies.

## Dependencies

- Hibernate Core 6.4.4.Final
- MySQL Connector/J 8.3.0
- Jakarta Persistence API 3.1.0
- JUnit 4.11 (for testing)

## Testing

Unit tests can be run using Maven:

```bash
mvn test
```

## License

This project is licensed under the MIT License. See the LICENSE file for details.
