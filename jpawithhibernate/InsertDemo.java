package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class InsertDemo {
	public static void main(String[] args) {
		Movie movie=new Movie();			//creation of object of the entity class
		movie.setMovieId(104);
		movie.setMovieName("ABCD");
		movie.setRating("GOOD");
		EntityManager entityManager=null; 	//declare globally
		EntityTransaction transaction=null;	//declare globally
	try {
		
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence"); //"TestPersistence" present in persistence.xml file inside the persistence-unit
										
										
		
		entityManager=entityManagerFactory.createEntityManager();
		transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(movie);    //here we have to pass the object of that entity class
		transaction.commit();				//to save the data permanently which has been transfered to database
	}catch (Exception e) {
		e.printStackTrace();
		transaction.rollback();
	}
	
		entityManager.close();
	}//end of the main method
}//end of the class
