package com.movies.controllers;

import com.movies.controllers.requests.movie.AddMovieRequest;
import com.movies.controllers.responses.MovieResponse;
import com.movies.controllers.responses.MoviesResponse;
import com.movies.domain.Movie;
import com.movies.services.IMovieService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/movies")
@Slf4j
public class MovieController {

    @Autowired
    private IMovieService movieService;

    @GetMapping(path = "/")
    public ResponseEntity<MoviesResponse> getMovies() {
        log.info("Showing all movies");
        List<Movie> movies = movieService.findAll();
        MoviesResponse response = MoviesResponse.builder().movies(movies).total(movies.size()).build();
        return ResponseEntity.ok(response);
    }

    @PostMapping(path = "/add", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MovieResponse> addMovie(@RequestBody AddMovieRequest req) {
        log.info("Adding a movie");
        Movie movie = Movie.builder().title(req.getTitle()).build();
        movieService.save(movie);
        MovieResponse response = MovieResponse.builder().id(movie.getId()).title(movie.getTitle()).build();
        return ResponseEntity.ok(response);
    }

}
