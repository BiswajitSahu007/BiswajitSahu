package com.capg.map.treemap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		TreeMap<Integer, String> t1=new TreeMap<Integer, String>();
		t1.put(189, "biswajit");
		t1.put(119, "arpita");
		t1.put(289, "pratyusha");
		t1.put(119, "alppe");
		//t1.put(null, "arpita"); //NULLPOINTEREXCEPTION
		
		Set<Map.Entry<Integer, String>> s1=t1.entrySet();
		
		for (Map.Entry<Integer, String> entry : s1) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println("--------------");
		}
	}

}
