package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.onetoone.EmpInfo;
import com.capgemini.jpawithhibernate.onetoone.EmpOtherInfo;



public class TestOneToOne {
	public static void main(String[] args) {
//		EmpInfo emp=new EmpInfo();
//		emp.setEid(1);
//		emp.setEname("Biswajit");
//		emp.setEmail("sah605@gmail.com");
//		emp.setPassword("122433322fd");
//		
//		EmpOtherInfo other=new EmpOtherInfo();
//		other.setId(10);
//		other.setPan("BSHF565SDC");
//		other.setFathername("B.K Sahu");
//		other.setEmployee(emp);
		EntityManager entityManager=null; 	//declare globally
		EntityTransaction transaction=null;	//declare globally
		try {

			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence"); //"TestPersistence" present in persistence.xml file inside the persistence-unit



			entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			EmpInfo emp=entityManager.find(EmpInfo.class, 1);	 //provide foreign key here after .class name
			System.out.println(emp.getOther().getPan());
			//entityManager.persist(other); 
			System.out.println("record saved....");							//here we have to pass the object of that entity class
			transaction.commit();				//to save the data permanently which has been transfered to database
		}catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

		entityManager.close();
	}//end of the main method
}//end of the class

