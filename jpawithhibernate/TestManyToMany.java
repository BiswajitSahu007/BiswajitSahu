package com.capgemini.jpawithhibernate;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.manytomany.TrainingInfo;
import com.capgemini.jpawithhibernate.onetoone.EmpInfo;

public class TestManyToMany {
	public static void main(String[] args) {

		EmpInfo emp=new EmpInfo();
		emp.setEid(50);
		emp.setEname("Ram1");
		emp.setEmail("ram1@gmal.com");
		emp.setPassword("1w1d13");

		EmpInfo emp1=new EmpInfo();
		emp1.setEid(60);
		emp1.setEname("RamBabu1");
		emp1.setEmail("babu1@gmal.com");
		emp1.setPassword("sdhvhdsag");

		EmpInfo emp2=new EmpInfo();
		emp2.setEid(70);
		emp2.setEname("Sitaa");
		emp2.setEmail("sitaa@gmal.com");
		emp2.setPassword("ram12");

		ArrayList<EmpInfo> aList=new ArrayList<EmpInfo>();
		aList.add(emp);
		aList.add(emp1);
		aList.add(emp2);
		
		TrainingInfo tInfo=new TrainingInfo();
		tInfo.setTId(103);
		tInfo.setTName("JAVAScript FS");
		tInfo.setEList(aList);
		//		TrainingInfo tInfo1=new TrainingInfo();
		//		tInfo.setTId(101);
		//		tInfo.setTName("JAVAScript FS");

		EntityManager entityManager=null; 	//declare globally
		EntityTransaction transaction=null;	//declare globally
		try {

			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence"); 
			entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(tInfo); 
			//entityManager.persist(tInfo1);							//here we have to pass the object of that entity class
			transaction.commit();				//to save the data permanently which has been transfered to database
		}catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

		entityManager.close();
	}
}
