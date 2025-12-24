package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Domain.Movie;
import com.example.demo.Service.MovieService;

@RestController
public class MovieController {
	private final MovieService movieService;
	public MovieController(MovieService movieService) {
		this.movieService = movieService;
	}
	
	@GetMapping("/movie")
	public List<Movie> Movies() {
		return movieService.getMoives();
	}
	@GetMapping("/movie/u")
	public List<Movie> Movieu() {
		return movieService.getMoivieU();
	}
	@GetMapping("/movie/r")
	public List<Movie> Movier() {
		return movieService.getMovieR();
	}
}
