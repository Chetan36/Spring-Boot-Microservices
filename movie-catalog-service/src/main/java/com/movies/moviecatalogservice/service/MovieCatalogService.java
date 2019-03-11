package com.movies.moviecatalogservice.service;

import java.util.List;

import com.movies.moviecatalogservice.model.Movie;

public interface MovieCatalogService {
	
	public List<Movie> getAllMovies();
	
	public Movie getMovieById(String id);
	
	public Movie addNewMovie(Movie movie);

}
