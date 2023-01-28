package com.movies.controllers.responses;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MovieResponse {

    private Long id;
    private String title;

}
