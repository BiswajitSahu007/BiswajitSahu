package com.capgemini.jpawithhibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*POJO class*/								//must be follow POJO class properties
@Entity										//To show this is the entity class
@Table(name="movie")						//to connect with the table -"movie"
public class Movie {
	@Id									//for making the column as primary key
	@Column                                 //@Column(name="column name")
											//if data member name and column name are different.
	private int movieId;
	@Column
	private String movieName;
	@Column
	private String rating;
	
								//getter and setter methods of the data members
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	
}
