package com.capg.map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<Integer, String> h1=new HashMap<Integer, String>();
		h1.put(12,"ganesh" );
		h1.put(44,"mukesh" );
		h1.put(36, "suresh");
		h1.put(82,"ramesh" );
		h1.put(89, null);
		h1.put(67, null);
		Set<Map.Entry<Integer, String>> s1=h1.entrySet();
		
		//forEachLoop
		for (Map.Entry<Integer, String> entry : s1) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}

}
