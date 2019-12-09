package com.capg.map.treemap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeSet2 {

	public static void main(String[] args) {
		TreeMap<Student, String> t1=new TreeMap<Student, String>();
		t1.put(new Student(23, "biswajit"), "electronic");
		t1.put(new Student(22, "santosh"), "cse");
		t1.put(new Student(24, "devi"), "csit");
		
		Set<Map.Entry<Student, String>> s1=t1.entrySet();
		
		for (Map.Entry<Student, String> entry : s1) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println("-----------------------");
		}
		
		
	}

	
}
