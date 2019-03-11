package com.movies.movieratingservice.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movies.movieratingservice.model.MovieRating;
import com.movies.movieratingservice.service.MovieRatingService;

@RestController
public class MovieRatingController {
	
	Logger logger = LoggerFactory.getLogger(MovieRatingController.class);
	
	@Autowired
	MovieRatingService movieRatingService;
	
	@GetMapping
	public List<MovieRating> getAllMovieRatings() {
		logger.info("MovieRatingController.getAllMovieRatings()");
		return this.movieRatingService.getAllMovieRatings();
	}
	
	@GetMapping("/{movieId}")
	public MovieRating getMovieRatingById(@PathVariable("movieId") String movieId) {
		logger.info("MovieRatingController.getMovieRatingById()");
		return this.movieRatingService.getMovieRatingById(movieId);
	}
	
	@PostMapping
	public MovieRating postMovieRating(@RequestBody MovieRating movieRating) {
		logger.info("MovieRatingController.postMovieRating()");
		return this.movieRatingService.addMovieRating(movieRating);
	}

}
