package com.capgemini.jpawithhibernate.jpql;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
public class Retrieve {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager=entityManagerFactory.createEntityManager();		
		//String jpql="from Movie";
		String jpql="select movieName from Movie";
		Query query=entityManager.createQuery(jpql);
		 List<String> record=query.getResultList();
		for (String movie : record) {
//			System.out.println("movie id: "+movie.getMovieId());
//			System.out.println("movieName: "+movie.getMovieName());
//			System.out.println("rating: "+movie.getRating());
//			System.out.println("*******************************");
			System.out.println(movie);
		
		}
		entityManager.close();
		
	}
}
