package com.movies.controllers.responses;

import java.util.List;

import com.movies.domain.Movie;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MoviesResponse {

    private List<Movie> movies;
    private int total;

}
