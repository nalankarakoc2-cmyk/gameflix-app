# GameFlix Backend

GameFlix is a Spring Boot backend application that allows users to register and log in. User passwords are securely hashed using BCrypt before they are stored in the database. The project also includes JUnit 5 tests to verify that the registration and login service works correctly.

## Technologies Used

- Java 17
- Spring Boot 3
- Spring Data JPA
- H2 Database
- Spring Security (BCrypt)
- Maven
- Docker
- GitHub Actions
- JUnit 5

## API Endpoints

### Register

**POST** `/register`

Creates a new user account.

Example:

```json
{
  "username": "nalan",
  "password": "password123"
}
```

### Login

**POST** `/login`

Logs in an existing user.

Example:

```json
{
  "username": "nalan",
  "password": "password123"
}
```

## Run the Application

Run with Maven:

```bash
mvn clean package
mvn spring-boot:run
```

The application runs at:

```
http://localhost:8080
```

## Run with Docker

Build the Docker image:

```bash
docker build -t gameflix-backend .
```

Run the container:

```bash
docker run -p 8080:8080 gameflix-backend
```

## Run the Tests

Run all JUnit tests:

```bash
mvn test
```

The project includes service tests for:

- Registering a new user
- Preventing duplicate usernames
- Logging in with the correct password
- Rejecting an incorrect password

## Docker Files

### Dockerfile

The Dockerfile packages the Spring Boot application into a Docker image so it can run on any computer with Docker installed.

### docker-compose.yml

The docker-compose file starts the application container and makes it easier to run the project using a single command.

## AI Usage

ChatGPT was used to help with coding. All code was reviewed, tested, and verified by me before submission.
