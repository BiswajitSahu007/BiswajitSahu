package com.capgemini.junit.junit5;

import java.util.Scanner;

public class Caalculator {
	public int add(int a,int b) {
		return a+b;
		
	}
	public int mul(int a,int b) {
		return a*b;
		
	}
	public int div(int a,int b) {
		return a/b;
		
	}
	public int findLength(String s) {
		return s.length();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 1st number");
		int a=sc.nextInt();
		System.out.println("enter the 2nd number");
		int b=sc.nextInt();
		Caalculator c1=new Caalculator();
		int result=c1.add(a, b);
		System.out.println("Addition : "+result);
		
		int mulresult=c1.mul(a, b);
		System.out.println("multiplication :"+mulresult);
		
		int divresult=c1.div(a, b);
		System.out.println("Division :"+divresult);
	}
	
}
