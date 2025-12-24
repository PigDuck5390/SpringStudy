package com.example.demo.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.Domain.Movie;
import com.example.demo.mapper.MovieMapper;

@Service
public class MovieService {
	private final MovieMapper movieMapper;
	public MovieService(MovieMapper movieMapper) {
		this.movieMapper = movieMapper;
	}
	
	public List<Movie> getMoives() {
		return movieMapper.findMovie();
	}
	public List<Movie> getMoivieU() {
		List<Movie> result = movieMapper.findMovie();
		List<Movie> r = result.stream()
				.filter(movie->"위키드".equals(movie.getTitle()))
				.collect(Collectors.toList());
		return r;
	}
	public List<Movie> getMovieR() {
		return movieMapper.findMovieR();
	}
}
