package com.movies.movieinfoservice.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.movies.movieinfoservice.data.MovieInfoData;
import com.movies.movieinfoservice.model.MovieInfo;
import com.movies.movieinfoservice.service.MovieInfoService;

@Service
public class MovieInfoServiceImpl implements MovieInfoService {
	
	Logger logger = LoggerFactory.getLogger(MovieInfoServiceImpl.class);

	@Override
	public List<MovieInfo> getAllMovieInfo() {
		logger.info("MovieInfoService.getAllMovieInfo()");
		return MovieInfoData.MOVIE_INFO;
	}

	@Override
	public MovieInfo getMovieInfoById(String movieId) {
		logger.info("MovieInfoService.getMovieInfoById()");
		MovieInfo movieInfoData = null;
		boolean found = false;
		for (MovieInfo movieInfo : MovieInfoData.MOVIE_INFO) {
			if (movieInfo.getMovieId().equals(movieId)) {
				movieInfoData = movieInfo;
				found = true;
				break;
			}
		}
		if (found) {
			return movieInfoData;
		}
		return null;
	}

	@Override
	public MovieInfo addMovieInfo(MovieInfo movieInfo) {
		logger.info("MovieInfoService.addMovieInfo()");
		if (movieInfo.getLeadActor() != "" && movieInfo.getLeadActress() != "" && movieInfo.getMoviePlot() != "" && movieInfo.getReleaseYear() != "") {
			movieInfo.setMovieId("MOVIE00" + Integer.toString((MovieInfoData.MOVIE_INFO.size() + 1)));
			MovieInfoData.MOVIE_INFO.add(movieInfo);
			return movieInfo;
		} else {
			return null;
		}
	}

}
