package com.movies.moviecatalogservice.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.movies.moviecatalogservice.data.MovieCatalogData;
import com.movies.moviecatalogservice.model.Movie;
import com.movies.moviecatalogservice.model.MovieInfo;
import com.movies.moviecatalogservice.model.MovieObject;
import com.movies.moviecatalogservice.model.MovieRating;
import com.movies.moviecatalogservice.service.MovieCatalogService;

@Service
public class MovieCatalogServiceImpl implements MovieCatalogService {
	
	Logger logger = LoggerFactory.getLogger(MovieCatalogServiceImpl.class);
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private WebClient.Builder webClientBuilder;

	@Override
	public List<Movie> getAllMovies() {
		logger.info("MovieCatalogService.getAllMovies()");
		return MovieCatalogData.MOVIE_CATALOG;
	}

	@Override
	public MovieObject getMovieById(String id) {
		logger.info("MovieCatalogService.getMovieById()");
		MovieObject movieObject = new MovieObject();
		
		boolean found = false;
		for (Movie movie : MovieCatalogData.MOVIE_CATALOG) {
			if (movie.getMovieId().equals(id)) {
				
				// First way
				MovieInfo movieInfo = restTemplate.getForObject("http://localhost:8092/info/"+id, MovieInfo.class);
				
				// Second way
				MovieRating movieRating = this.webClientBuilder.build()
					.get()
					.uri("http://localhost:8093/rating/"+id)
					.retrieve()
					.bodyToMono(MovieRating.class)
					.block();
				
				movieObject.setMovieId(movie.getMovieId());
				movieObject.setMovieName(movie.getMovieName());
				movieObject.setMovieInfo(movieInfo);
				movieObject.setMovieRating(movieRating);
				found = true;
				break;
			}
		}
		
		if (found) {
			return movieObject;
		}
		return null;
	}

	@Override
	public Movie addNewMovie(Movie movie) {
		logger.info("MovieCatalogService.addNewMovie()");
		if (movie.getMovieName() != "") {
			movie.setMovieId("MOVIE00" + Integer.toString((MovieCatalogData.MOVIE_CATALOG.size() + 1)));
			MovieCatalogData.MOVIE_CATALOG.add(movie);
			return movie;
		} else {
			return null;
		}
	}

}
