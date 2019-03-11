package com.movies.moviecatalogservice.model;

public class Movie {
	
	private String movieId;
	private String movieName;
	private String moviePlot;
	
	public Movie(String movieId, String movieName, String moviePlot) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.moviePlot = moviePlot;
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
	public String getMoviePlot() {
		return moviePlot;
	}
	public void setMoviePlot(String moviePlot) {
		this.moviePlot = moviePlot;
	}

}
