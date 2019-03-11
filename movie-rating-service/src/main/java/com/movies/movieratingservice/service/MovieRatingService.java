package com.movies.movieratingservice.service;

import java.util.List;

import com.movies.movieratingservice.model.MovieRating;

public interface MovieRatingService {
	
	public List<MovieRating> getAllMovieRatings();
	
	public MovieRating getMovieRatingById(String movieId);
	
	public MovieRating addMovieRating(MovieRating movieRating);

}
