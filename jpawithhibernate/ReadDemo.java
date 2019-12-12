package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class ReadDemo {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Movie record=entityManager.find(Movie.class, 1);   //to convert text into object 
		
		System.out.println("id: "+record.getMovieId());
		System.out.println("movie name: "+record.getMovieName());
		System.out.println("rating: "+record.getRating());
		
		entityManager.close();
	}

}
