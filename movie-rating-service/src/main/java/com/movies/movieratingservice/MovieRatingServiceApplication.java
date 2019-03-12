package com.movies.movieratingservice;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.movies.movieratingservice.data.MovieRatingData;
import com.movies.movieratingservice.model.MovieRating;

@EnableEurekaClient
@SpringBootApplication
public class MovieRatingServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MovieRatingServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		MovieRatingData.MOVIE_RATING = new ArrayList<>();
		MovieRatingData.MOVIE_RATING.add(new MovieRating("MOVIE001", 5, 3.9));
		MovieRatingData.MOVIE_RATING.add(new MovieRating("MOVIE002", 5, 3.5));
		MovieRatingData.MOVIE_RATING.add(new MovieRating("MOVIE003", 5, 3.6));
		MovieRatingData.MOVIE_RATING.add(new MovieRating("MOVIE004", 5, 4.1));
	}

}
