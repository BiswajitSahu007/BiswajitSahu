package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class Reattachching {
	public static void main(String[] args) {
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {


			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			Movie record=entityManager.find(Movie.class, 2);
			System.out.println(entityManager.contains(record));   //it returns boolean true or false
			entityManager.detach(record);							//to detach from the database
			System.out.println(entityManager.contains(record));		//check if it contains the object after detaching
			//record.setMovieName("gangs of wassepur2");				//these records won't change because record has been detached from the database so we can't change and the records will not modify or save
			//record.setRating("Better");
			Movie reattachMovie=entityManager.merge(record);		//o re-attach the object
			reattachMovie.setMovieName("gangs of wassepur2");
			reattachMovie.setRating("Better");
			System.out.println("Record updated...");
			transaction.commit();
			
		}catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();
	}
}

