package com.movies.moviecatalogservice.service;

import java.util.List;

import com.movies.moviecatalogservice.model.Movie;
import com.movies.moviecatalogservice.model.MovieObject;

public interface MovieCatalogService {
	
	public List<Movie> getAllMovies();
	
	public MovieObject getMovieById(String id);
	
	public Movie addNewMovie(Movie movie);

}
