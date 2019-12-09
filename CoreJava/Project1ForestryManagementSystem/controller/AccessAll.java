package com.cpg.forest_sys.controller;
import java.util.Scanner;
public class AccessAll {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("---------------------------------Forestry Management System------------------------------------");
		System.out.println("1.CONTRACT DETAILS");
		System.out.println("2.CUSTOMER DETAILS");
		System.out.println("3.PRODUCT  DETAILS");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("---------------WELCOME TO CONTRACT DATABASE-------------");
			System.out.println("********************************************************");
			ContractImpl.main(args);
			break;
		case 2:
			System.out.println("---------------WELCOME TO CUSTOMER DATABASE-------------");
			System.out.println("********************************************************");
			CustomerImpl.main(args);
			break;
		case 3:
			System.out.println("---------------WELCOME TO PRODUCT DATABASE-------------");
			System.out.println("********************************************************");
			ProductImpl.main(args);
			break;
			default :
				System.err.println("Something went wrong...");
				break;
		}
	}

}
