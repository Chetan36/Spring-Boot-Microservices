package com.movies.moviecatalogservice.model;

public class MovieRating {
	
	private String movieId;
	private double maxRating;
	private double receivedRating;
	
	public MovieRating() {
		super();
	}
	
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public double getMaxRating() {
		return maxRating;
	}
	public void setMaxRating(double maxRating) {
		this.maxRating = maxRating;
	}
	public double getReceivedRating() {
		return receivedRating;
	}
	public void setReceivedRating(double receivedRating) {
		this.receivedRating = receivedRating;
	}

}
