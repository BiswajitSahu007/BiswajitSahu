package com.capg.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashSet2 {

	public static void main(String[] args) {
		LinkedHashMap<Integer, Employee> l1=new LinkedHashMap<Integer, Employee>();
		l1.put(34, new Employee(37655, "Biswajit"));
		l1.put(64, new Employee(37273, "Devi"));
		l1.put(44, new Employee(37422, "ommkar"));
		
		System.out.println(l1.get(34));
		
		Set<Map.Entry<Integer, Employee>> s1=l1.entrySet();
		
		for (Map.Entry<Integer, Employee> entry : s1) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
	}

}
