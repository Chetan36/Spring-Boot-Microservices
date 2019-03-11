package com.movies.movieratingservice.model;

public class MovieRating {
	
	private String movieId;
	private double maxRating;
	private double receivedRating;
	
	public MovieRating() {
		super();
	}

	public MovieRating(String movieId, double maxRating, double receivedRating) {
		super();
		this.movieId = movieId;
		this.maxRating = maxRating;
		this.receivedRating = receivedRating;
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
