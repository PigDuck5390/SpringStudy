package com.example.demo.Domain;

public class Movie {
	private int movie_id;
	private String title;
	private String short_description;
	private int reserv_count;
	
	
	public int getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getShort_description() {
		return short_description;
	}
	public void setShort_description(String short_description) {
		this.short_description = short_description;
	}
	public int getReserv_count() {
		return reserv_count;
	}
	public void setReserv_count(int reserv_count) {
		this.reserv_count = reserv_count;
	}
	
	
}
