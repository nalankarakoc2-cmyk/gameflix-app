# GameFlix Backend

## About

This project is a Spring Boot backend for the GameFlix application. It allows users to register and log in. User information is stored in an H2 in-memory database, and passwords are encrypted using BCrypt.

## Technologies Used

- Java 17
- Spring Boot 3
- Spring Data JPA
- H2 Database
- Maven
- Docker
- GitHub Actions

## API Endpoints

### Register a User

**POST** `/register`

Example:

```json
{
  "username": "nalan",
  "password": "password123"
}
```

Returns:

- `201 Created` if the user is registered successfully.
- `409 Conflict` if the username already exists.

### Login

**POST** `/login`

Checks the username and password and returns the appropriate response.

## Running the Project

### Using Maven

```bash
mvn clean package
mvn spring-boot:run
```

The application runs on:

```
http://localhost:8080
```

### Using Docker

Build the Docker image:

```bash
docker build -t gameflix-backend .
```

Run the container:

```bash
docker run --name gameflix-backend -p 8080:8080 gameflix-backend
```

Stop the container:

```bash
docker stop gameflix-backend
```

Remove the container:

```bash
docker rm gameflix-backend
```

## GitHub Actions Workflow

The workflow file is located in:

```
.github/workflows/ci.yml
```

When I push my project to the **main** branch, GitHub Actions automatically:

1. Checks out the project.
2. Sets up Java 17.
3. Builds the project using Maven.
4. Builds the Docker image.

This helps make sure the project builds successfully every time I push changes to GitHub.


## AI Usage

ChatGPT was used to help with coding. All code was reviewed, tested, and verified by me before submission.
