package com.movies.moviecatalogservice;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.movies.moviecatalogservice.data.MovieCatalogData;
import com.movies.moviecatalogservice.model.Movie;

@EnableEurekaClient
@SpringBootApplication
public class MovieCatalogServiceApplication implements CommandLineRunner {
	
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public WebClient.Builder getWebClientBuilder() {
		return WebClient.builder();
	}

	public static void main(String[] args) {
		SpringApplication.run(MovieCatalogServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		MovieCatalogData.MOVIE_CATALOG = new ArrayList<>();
		MovieCatalogData.MOVIE_CATALOG.add(new Movie("MOVIE001", "Terminator"));
		MovieCatalogData.MOVIE_CATALOG.add(new Movie("MOVIE002", "Robocop"));
		MovieCatalogData.MOVIE_CATALOG.add(new Movie("MOVIE003", "I, Robot"));
		MovieCatalogData.MOVIE_CATALOG.add(new Movie("MOVIE004", "Transformers"));
	}

}
