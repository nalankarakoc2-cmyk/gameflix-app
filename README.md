# GameFlix Backend

GameFlix is a Spring Boot backend that provides user registration and login endpoints. It uses an H2 in-memory database and BCrypt password hashing.

## Technologies

- Java 17
- Spring Boot 3
- Spring Data JPA
- H2 Database
- BCrypt
- Maven
- Docker
- GitHub Actions

## API Endpoints

- `POST /register` — creates a new user and returns `201 Created`.
- `POST /login` — validates a user's credentials and returns `200 OK`.

Example request body:

```json
{
  "username": "nalan",
  "password": "password123"
}
```

## Run Locally with Maven

```bash
mvn clean package
mvn spring-boot:run
```

The application runs at `http://localhost:8080`.

## Run with Docker

```bash
docker build -t gameflix-backend .
docker run --name gameflix-backend -p 8080:8080 gameflix-backend
```

To stop and remove the container:

```bash
docker stop gameflix-backend
docker rm gameflix-backend
```

## CI/CD Workflow

The workflow file is located at `.github/workflows/ci.yml`. Whenever code is pushed to the `main` branch or a pull request targets `main`, GitHub Actions:

1. Checks out the repository.
2. Sets up Java 17.
3. Builds and tests the project with Maven.
4. Builds the Docker image named `gameflix-backend`.

## AI Usage

ChatGPT was used to help explain Docker and GitHub Actions configuration and to improve the documentation. The project was reviewed and tested by the student.
