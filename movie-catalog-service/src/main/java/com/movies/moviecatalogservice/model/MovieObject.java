package com.movies.moviecatalogservice.model;

public class MovieObject {
	
	private String movieId;
	private String movieName;
	private MovieInfo movieInfo;
	private MovieRating movieRating;
	
	public MovieObject() {
		super();
	}
	
	public String getMovieId() {
		return movieId;
	}
	
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	
	public String getMovieName() {
		return movieName;
	}
	
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	public MovieInfo getMovieInfo() {
		return movieInfo;
	}
	
	public void setMovieInfo(MovieInfo movieInfo) {
		this.movieInfo = movieInfo;
	}

	public MovieRating getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(MovieRating movieRating) {
		this.movieRating = movieRating;
	}

}
