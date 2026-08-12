package com.gameflix.auth.controller;

import com.gameflix.auth.model.Game;
import com.gameflix.auth.service.GameService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping
    public List<Game> getAllGames() {
        return gameService.getAllGames();
    }

    @GetMapping("/search")
    public List<Game> searchGames(@RequestParam String title) {
        return gameService.searchGames(title);
    }

    @PostMapping
    public Game addGame(@RequestBody Game game) {
        return gameService.addGame(game);
    }
}