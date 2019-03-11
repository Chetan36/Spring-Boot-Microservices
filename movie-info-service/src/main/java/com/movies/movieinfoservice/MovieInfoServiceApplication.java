package com.movies.movieinfoservice;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.movies.movieinfoservice.data.MovieInfoData;
import com.movies.movieinfoservice.model.MovieInfo;

@SpringBootApplication
public class MovieInfoServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MovieInfoServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		MovieInfoData.MOVIE_INFO = new ArrayList<>();
		MovieInfoData.MOVIE_INFO.add(new MovieInfo("MOVIE001", "Arnold Schwarzenegger", "Claire Fox", "1982", "Robot war movie."));
		MovieInfoData.MOVIE_INFO.add(new MovieInfo("MOVIE002", "Peter Weller", "Nancy Allen", "1987", "Robot war movie."));
		MovieInfoData.MOVIE_INFO.add(new MovieInfo("MOVIE003", "Will Smith", "Bridget Moynahan", "2004", "Robot war movie."));
		MovieInfoData.MOVIE_INFO.add(new MovieInfo("MOVIE004", "Shia LaBeouf", "Megan Fox", "2005", "Robot war movie."));
	}

}
