package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.Domain.Movie;

@Mapper
public interface MovieMapper {
	List<Movie> findMovie();
	List<Movie> findMovieR();
}
