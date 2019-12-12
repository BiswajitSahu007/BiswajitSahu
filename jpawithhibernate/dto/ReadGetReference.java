package com.capgemini.jpawithhibernate.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ReadGetReference {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		//Movie record=entityManager.find(Movie.class, 1);   //to convert text into object //if insert data is not there then it gives null pointer exception
		Movie record=entityManager.getReference(Movie.class, 1);
		System.out.println(record.getClass());
		
		System.out.println("id: "+record.getMovieId());
		System.out.println("movie name: "+record.getMovieName());
		System.out.println("rating: "+record.getRating());
		
		entityManager.close();

	}
	
	
	
}
