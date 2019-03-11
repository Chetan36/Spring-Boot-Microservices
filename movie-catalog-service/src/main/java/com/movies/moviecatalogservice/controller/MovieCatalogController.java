package com.movies.moviecatalogservice.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movies.moviecatalogservice.model.Movie;
import com.movies.moviecatalogservice.service.MovieCatalogService;

@RestController
public class MovieCatalogController {
	
	Logger logger = LoggerFactory.getLogger(MovieCatalogController.class);
	
	@Autowired
	private MovieCatalogService movieCatalogService;
	
	@GetMapping
	public List<Movie> getAllMovies() {
		logger.info("MovieCatalogController.getAllMovies()");
		return this.movieCatalogService.getAllMovies();
	}
	
	@GetMapping("/{movieId}")
	public Movie getMovieById(@PathVariable("movieId") String id) {
		logger.info("MovieCatalogController.getMovieById()");
		return this.movieCatalogService.getMovieById(id);
	}
	
	@PostMapping
	public Movie postMovie(@RequestBody Movie movie) {
		logger.info("MovieCatalogController.postMovie()");
		return this.movieCatalogService.addNewMovie(movie);
	}

}
