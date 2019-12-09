package com.capg.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMap1 {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> l1=new LinkedHashMap<String, Integer>();
		l1.put("OAR", 560017);
		l1.put("BTM", 560078);
		l1.put("BTR", 560035);
		l1.put("Hebbal", 560043);
		
		l1.remove("BTM");
		
		//to retrieve all the entry we go for entryset()
		Set<Map.Entry<String, Integer>> s1=l1.entrySet();
		
		//forEachLoop to retrive the entries present
		for (Map.Entry<String, Integer> entry : s1) {
			
			//you can use both the sop statement to retrieve the entry
			//System.out.println(entry);
			System.out.println(entry.getKey() +"::"+ entry.getValue());
			
			
			System.out.println("-----");
			
		}
	}

}
