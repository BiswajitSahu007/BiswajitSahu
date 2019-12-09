package com.capg.map.treemap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapSortingAge {

	public static void main(String[] args) {
		TreeMap<Student1, String> t1=new TreeMap<Student1, String>();
		t1.put(new Student1(23, "biswajit"), "electronic");
		t1.put(new Student1(22, "santosh"), "cse");
		t1.put(new Student1(24, "devi"), "csit");

		Set<Entry<Student1, String>> s1=t1.entrySet();

		for (Entry<Student1, String> entry : s1) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println("-----------------------");
		}

	}
}