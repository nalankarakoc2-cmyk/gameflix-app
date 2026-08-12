package com.gameflix.auth;

import com.gameflix.auth.model.Game;
import com.gameflix.auth.repository.GameRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GameFlixApplication {

    public static void main(String[] args) {
        SpringApplication.run(GameFlixApplication.class, args);
    }

    @Bean
    CommandLineRunner loadGames(GameRepository gameRepository) {
        return args -> {

            gameRepository.save(
                    new Game("Minecraft", "Sandbox", "PC")
            );

            gameRepository.save(
                    new Game("Fortnite", "Battle Royale", "PC")
            );

            gameRepository.save(
                    new Game("Among Us", "Multiplayer", "PC")
            );

            gameRepository.save(
                    new Game("Rocket League", "Sports", "PC")
            );

            gameRepository.save(
                    new Game("Stardew Valley", "Simulation", "PC")
            );
        };
    }
}