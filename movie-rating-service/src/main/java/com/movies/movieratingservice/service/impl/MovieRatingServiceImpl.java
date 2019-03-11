package com.movies.movieratingservice.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.movies.movieratingservice.data.MovieRatingData;
import com.movies.movieratingservice.model.MovieRating;
import com.movies.movieratingservice.service.MovieRatingService;

@Service
public class MovieRatingServiceImpl implements MovieRatingService {
	
	Logger logger = LoggerFactory.getLogger(MovieRatingServiceImpl.class);

	@Override
	public List<MovieRating> getAllMovieRatings() {
		logger.info("MovieRatingService.getAllMovieRatings()");
		return MovieRatingData.MOVIE_RATING;
	}

	@Override
	public MovieRating getMovieRatingById(String movieId) {
		logger.info("MovieRatingService.getMovieRatingById()");
		MovieRating movieRatingData = null;
		boolean found = false;
		for (MovieRating movieRating : MovieRatingData.MOVIE_RATING) {
			if (movieRating.getMovieId().equals(movieId)) {
				movieRatingData = movieRating;
				found = true;
				break;
			}
		}
		if (found) {
			return movieRatingData;
		}
		return null;
	}

	@Override
	public MovieRating addMovieRating(MovieRating movieRating) {
		logger.info("MovieRatingService.addMovieRating()");
		if (movieRating.getMaxRating() != 0 && movieRating.getReceivedRating() != 0) {
			movieRating.setMovieId("MOVIE00" + Integer.toString((MovieRatingData.MOVIE_RATING.size() + 1)));
			MovieRatingData.MOVIE_RATING.add(movieRating);
			return movieRating;
		} else {
			return null;
		}
	}

}
