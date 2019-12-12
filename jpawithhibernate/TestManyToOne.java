package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.manytoone.EmpExperience;
import com.capgemini.jpawithhibernate.onetoone.EmpInfo;

public class TestManyToOne {
	public static void main(String[] args) {
		EmpInfo emp=new EmpInfo();
		emp.setEid(2);
		emp.setEname("ram");
		emp.setEmail("ram@gmail.com");
		emp.setPassword("1234");
		
		EmpExperience exp=new EmpExperience();
		exp.setExpId(5);
		exp.setCname("Capgemini");
		exp.setNoOfYear(2);
		exp.setEmp(emp);
		
		EmpExperience exp1=new EmpExperience();
		exp1.setExpId(3);
		exp1.setCname("Delloite");
		exp1.setEmp(emp);
		exp1.setNoOfYear(1);
		EntityManager entityManager=null; 	//declare globally
		EntityTransaction transaction=null;	//declare globally
	try {
		
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence"); //"TestPersistence" present in persistence.xml file inside the persistence-unit
										
										
		
		entityManager=entityManagerFactory.createEntityManager();
		transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(exp);  
		entityManager.persist(exp1);	
		System.out.println("record updated...");									//here we have to pass the object of that entity class
		transaction.commit();				//to save the data permanently which has been transfered to database
	}catch (Exception e) {
		e.printStackTrace();
		transaction.rollback();
	}
	
		entityManager.close();
	}//end of the main method
}
