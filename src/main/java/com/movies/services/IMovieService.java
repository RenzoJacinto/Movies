package com.movies.services;

import java.util.List;

import com.movies.domain.Movie;

public interface IMovieService {

    void save(Movie movie);

    void delete(Long id);

    List<Movie> findAll();

    Movie findById(Long id);

    List<Movie> findByTitle(String title);
    
}
