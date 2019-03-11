package com.movies.movieinfoservice.model;

public class MovieInfo {
	
	private String movieId;
	private String leadActor;
	private String leadActress;
	private String releaseYear;
	private String moviePlot;
	
	public MovieInfo(String movieId, String leadActor, String leadActress, String releaseYear, String moviePlot) {
		super();
		this.movieId = movieId;
		this.leadActor = leadActor;
		this.leadActress = leadActress;
		this.releaseYear = releaseYear;
		this.moviePlot = moviePlot;
	}
	
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getLeadActor() {
		return leadActor;
	}
	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}
	public String getLeadActress() {
		return leadActress;
	}
	public void setLeadActress(String leadActress) {
		this.leadActress = leadActress;
	}
	public String getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}
	public String getMoviePlot() {
		return moviePlot;
	}

	public void setMoviePlot(String moviePlot) {
		this.moviePlot = moviePlot;
	}	

}
