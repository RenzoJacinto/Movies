package com.movies.controllers.responses;

import java.util.List;

import com.movies.domain.Movie;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MoviesResponse {

    private List<Movie> movies;
    private int total;
    
}
