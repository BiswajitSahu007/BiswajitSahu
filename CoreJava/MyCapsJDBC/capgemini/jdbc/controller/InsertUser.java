package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.factory.UserFactory;
import com.capgemini.jdbc.services.UserServices;

public class InsertUser {

	public static void main(String[] args) {
		UserServices services=UserFactory.instanceOfUserServicesImpl();
		UserBean user=new UserBean();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter userid....");
		user.setUserid(Integer.parseInt(sc.nextLine()));
		System.out.println("enter the username...");
		user.setUsername(sc.nextLine());
		System.out.println("enter the email...");
		user.setEmail(sc.nextLine());
		System.out.println("enter the password... ");
		user.setPassword(sc.nextLine());
		
		if(services.insertUser(user)) {
			System.out.println("user inserted...");
		}else {
			System.err.println("something went wrong");
		}
	}
}
