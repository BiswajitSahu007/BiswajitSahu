package com.capg.map.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap2 {

	public static void main(String[] args) {
		HashMap<Integer, Student> h1=new HashMap<Integer, Student>();
		h1.put(34, new Student(22, "biswajit"));
		h1.put(43, new Student(25, "BULU"));
		h1.put(null, null);
		h1.put(34, new Student(55, "biswajit"));
		
		Collection<Student> c1=h1.values();
		
		for (Student student : c1) {
			System.out.println(student);
		}
		System.out.println("---------------------");
		Set<Integer> s1=h1.keySet();
		
		for (Integer integer : s1) {
			System.out.println(integer);
		}
		System.out.println("----------------------");
		System.out.println(h1.containsKey(34));
		System.out.println(h1.containsValue(new Student(25, "BULU")));
	}

}
