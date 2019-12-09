package com.cpg.forest_sys.dao;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import com.cpg.forest_sys.dto.Contract;
import com.cpg.forest_sys.dto.Customer;
import com.cpg.forest_sys.dto.Product;

public class ForestDAOImpl implements ForestDAO {
	Map<Integer, Contract> m1=new TreeMap<Integer, Contract>();
	Map<Integer, Customer> m2=new TreeMap<Integer, Customer>();
	Map<Integer, Product> m3=new TreeMap<Integer, Product>();
	@Override
	public Map<Integer, Contract> addTheContract(Contract cbean) {
	
		System.out.println("Enter contract number:");
		Scanner sc=new Scanner(System.in);
		int contractno=sc.nextInt();
		m1.put(contractno, cbean);
		return m1;
		
	}
	
	@Override
	public Map<Integer, Customer> addTheCustomer(Customer csbean) {
		
		System.out.println("Enter customer number:");
		Scanner sc=new Scanner(System.in);
		int customerno=sc.nextInt();
		m2.put(customerno, csbean);
		return m2;
	}

	@Override
	public Map<Integer, Product> addTheProduct(Product pbean) {
		System.out.println("Enter ProductID number:");
		Scanner sc=new Scanner(System.in);
		int productno=sc.nextInt();
		m3.put(productno,pbean);
		return m3;
	}

}