package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteDynamically {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();

		String jpql="delete from Movie where movieId=:id";
		
		Query query=entityManager.createQuery(jpql);
		query.setParameter("id", 100);
		int result=query.executeUpdate();
		if (result>0) {
			System.out.println("Deleted....");
		} else {
			System.err.println("Error...check once");
		}
		transaction.commit();
		entityManager.close();
	}
}
