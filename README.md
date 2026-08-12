# GameFlix

GameFlix is a web application that I created for my software engineering project. The goal of GameFlix is to allow users to create an account, log in, explore games, and search for games they are interested in.

For the final version of the project, I connected the Spring Boot backend with a simple frontend using HTML, CSS, and JavaScript.

## Features

The current GameFlix application includes:

- User registration
- User login
- Duplicate username checking
- Password hashing using BCrypt
- Game catalog
- Search games by title
- Frontend pages for Home, Login, Register, and Games

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- BCrypt
- JUnit 5
- HTML
- CSS
- JavaScript
- Maven
- Docker
- GitHub Actions

## How to Run the Project

1. Open the project in IntelliJ IDEA.
2. Run `GameFlixApplication.java`.
3. Wait for the Spring Boot application to start.
4. Open a browser.
5. Go to:

`http://localhost:8080`

From the home page, users can explore games, register for an account, or log in.

## Game Features

The Games page shows the games that are currently stored in the database.

Users can also search for a game by entering part of the game title. For example, searching for `mine` will return Minecraft.

The backend includes endpoints for getting all games and searching games.

## Registration and Login

Users can create an account by entering a username and password.

If the username already exists, the application will not create another account with the same username.

After creating an account, the user can log in using the correct username and password. If the password or username is incorrect, the login will fail.

Passwords are hashed using BCrypt instead of being stored as plain text.

## Backend Testing

I used JUnit 5 to test the UserService.

I created four tests for:

- Registering a new user
- Trying to register a duplicate user
- Logging in with the correct password
- Logging in with the wrong password

All four tests are currently passing.

Tests can also be run using:

`mvn test`

## Project Structure

The backend includes models, repositories, services, and controllers.

The frontend files are located in:

`src/main/resources/static`

The frontend includes:

- `index.html`
- `login.html`
- `register.html`
- `games.html`
- `css/style.css`

## Future Improvements

There are still many things that could be added to GameFlix in the future. Some ideas are:

- Game ratings and reviews
- Subscription options
- More games
- Personalized recommendations
- Admin features for adding and managing games

## AI Usage

ChatGPT was used to help with coding. All code was reviewed, tested, and verified by me before submission.
