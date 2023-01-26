package com.movies.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movies.controllers.responses.MoviesResponse;
import com.movies.domain.Movie;
import com.movies.services.IMovieService;

import lombok.extern.slf4j.Slf4j;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@Slf4j
public class MovieController {

    @Autowired
    private IMovieService movieService;

    @GetMapping("/movies")
    public ResponseEntity<MoviesResponse> getMovies() {
        log.info("getMovies() called");
        List<Movie> movies = movieService.findAll();
        return ResponseEntity.ok(new MoviesResponse(movies, movies.size()));
    }
    
}
