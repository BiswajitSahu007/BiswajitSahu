package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateDynamically {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		String jpql="update Movie set movieName=:name where movieId=:id ";
		Query query=entityManager.createQuery(jpql);
		query.setParameter("name", "bootnath");
		query.setParameter("id", 104);
		
		int result=query.executeUpdate();
			if (result>0) {
				System.out.println("Updated....");
			}else {
				System.err.println("Error...");
			}
		transaction.commit();
		entityManager.close();
	}
}
