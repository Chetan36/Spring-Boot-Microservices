package com.movies.movieinfoservice.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movies.movieinfoservice.model.MovieInfo;
import com.movies.movieinfoservice.service.MovieInfoService;
import com.movies.movieinfoservice.service.impl.MovieInfoServiceImpl;

@RestController
public class MovieInfoController {
	
	Logger logger = LoggerFactory.getLogger(MovieInfoServiceImpl.class);
	
	@Autowired
	MovieInfoService movieInfoService;
	
	@GetMapping
	public List<MovieInfo> getAllMovieInfo() {
		logger.info("MovieInfoController.getAllMovieInfo()");
		return this.movieInfoService.getAllMovieInfo();
	}
	
	@GetMapping("/{movieId}")
	public MovieInfo getMovieInfoById(@PathVariable("movieId") String movieId) {
		logger.info("MovieInfoController.getMovieInfoById()");
		return this.movieInfoService.getMovieInfoById(movieId);
	}
	
	@PostMapping
	public MovieInfo postMovieInfo(@RequestBody MovieInfo movieInfo) {
		logger.info("MovieInfoController.postMovieInfo()");
		return this.movieInfoService.addMovieInfo(movieInfo);
	}

}
