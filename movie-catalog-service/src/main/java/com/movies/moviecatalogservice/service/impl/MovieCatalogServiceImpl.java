package com.movies.moviecatalogservice.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.movies.moviecatalogservice.data.MovieCatalogData;
import com.movies.moviecatalogservice.model.Movie;
import com.movies.moviecatalogservice.service.MovieCatalogService;

@Service
public class MovieCatalogServiceImpl implements MovieCatalogService {

	@Override
	public List<Movie> getAllMovies() {
		return MovieCatalogData.MOVIE_CATALOG;
	}

	@Override
	public Movie getMovieById(String id) {
		Movie movieData = null;
		boolean found = false;
		for (Movie movie : MovieCatalogData.MOVIE_CATALOG) {
			if (movie.getMovieId().equals(id)) {
				movieData = movie;
				found = true;
				break;
			}
		}
		
		if (found) {
			return movieData;
		}
		return null;
	}

	@Override
	public Movie addNewMovie(Movie movie) {
		if (movie.getMovieName() != "" && movie.getMoviePlot() != "") {
			movie.setMovieId("MOVIE00" + Integer.toString((MovieCatalogData.MOVIE_CATALOG.size() + 1)));
			MovieCatalogData.MOVIE_CATALOG.add(movie);
			return movie;
		} else {
			return null;
		}
	}

}
