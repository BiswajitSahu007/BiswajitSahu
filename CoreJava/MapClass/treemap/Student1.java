package com.capg.map.treemap;

import java.util.Comparator;

public class Student1 implements Comparable<Student1>{
	int age;
	String name;
	public Student1(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public int compareTo(Student1 o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String toString() {
		return "Student1 [age=" + age + ", name=" + name + "]";
	}
	
	
}
