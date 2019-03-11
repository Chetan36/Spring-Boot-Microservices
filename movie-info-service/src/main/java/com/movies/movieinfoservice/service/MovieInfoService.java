package com.movies.movieinfoservice.service;

import java.util.List;

import com.movies.movieinfoservice.model.MovieInfo;

public interface MovieInfoService {
	
	public List<MovieInfo> getAllMovieInfo();
	
	public MovieInfo getMovieInfoById(String movieId);
	
	public MovieInfo addMovieInfo(MovieInfo movieInfo);

}
