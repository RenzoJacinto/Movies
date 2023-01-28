package com.movies.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movies.dao.IMovieDao;
import com.movies.domain.Movie;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MovieService implements IMovieService {

    @Autowired
    private IMovieDao movieDao;

    @Override
    public void save(Movie movie) {
        movieDao.save(movie);
        log.info("Movie saved: " + movie.toString());
    }

    @Override
    public void delete(Long id) {
        movieDao.deleteById(id);
    }

    @Override
    public List<Movie> findAll() {
        return movieDao.findAll();
    }

    @Override
    public Movie findById(Long id) {
        return movieDao.findById(id).orElse(null);
    }

    @Override
    public List<Movie> findByTitle(String title) {
        return movieDao.findByTitleLike(title);
    }

}
