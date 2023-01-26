package com.movies.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.movies.domain.Movie;

@Service
public class MovieService implements IMovieService {

    @Override
    public void save(Movie movie) {
    }

    @Override
    public void delete(Long id) {
    }

    @Override
    public List<Movie> findAll() {
        return new ArrayList<Movie>();
    }

    @Override
    public Movie findById(Long id) {
        return new Movie();
    }

    @Override
    public List<Movie> findByTitle(String title) {
        return new ArrayList<Movie>();
    }
    
}
