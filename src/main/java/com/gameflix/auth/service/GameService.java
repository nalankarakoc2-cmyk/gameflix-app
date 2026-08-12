package com.gameflix.auth.service;

import com.gameflix.auth.model.Game;
import com.gameflix.auth.repository.GameRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }

    public List<Game> searchGames(String title) {
        return gameRepository.findByTitleContainingIgnoreCase(title);
    }

    public Game addGame(Game game) {
        return gameRepository.save(game);
    }
}