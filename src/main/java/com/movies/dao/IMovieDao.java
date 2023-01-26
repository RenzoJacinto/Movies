package com.movies.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movies.domain.Movie;

public interface IMovieDao extends JpaRepository<Movie, Long> {

    public List<Movie> findByTitleLike(String title);
    
}
