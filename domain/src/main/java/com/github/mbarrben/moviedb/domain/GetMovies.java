package com.github.mbarrben.moviedb.domain;

import com.github.mbarrben.moviedb.model.entities.Movie;
import rx.Observable;

public interface GetMovies {
  Observable<Movie.List> get();
}
