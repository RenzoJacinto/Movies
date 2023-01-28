package com.movies.controllers.requests.movie;

import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddMovieRequest {

    @NotEmpty
    private String title;

}
