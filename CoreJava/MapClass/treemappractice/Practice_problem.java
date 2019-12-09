package com.capg.map.treemappractice;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;



public class Practice_problem {

	public static void main(String[] args) {
		ArrayList<Stud> a1=new ArrayList<Stud>();
		a1.add(new Stud(12, "biswajit"));
		a1.add(new Stud(11, "anu"));
		a1.add(new Stud(10, "divya"));
		ArrayList<Stud> a2=new ArrayList<Stud>();
		a2.add(new Stud(55, "budha"));
		a2.add(new Stud(45, "madu"));
		a2.add(new Stud(20, "dunia"));
		ArrayList<Stud> a3=new ArrayList<Stud>();
		a3.add(new Stud(25, "somu"));
		a3.add(new Stud(63, "fazlu"));
		a3.add(new Stud(252, "ganga"));
		
		
		TreeMap<String, ArrayList<Stud>> t1=new TreeMap<String, ArrayList<Stud>>();
		
		t1.put("engg 1st yr", a1);
		t1.put("engg 2nd yr", a2);
		t1.put("engg 3rd yr", a3);
		
		Set<Map.Entry<String, ArrayList<Stud>>> s1=t1.entrySet();
		
		for (Map.Entry<String, ArrayList<Stud>> entry : s1) {
			System.out.println(entry);
			System.out.println("---------------------------");
		}
		
	}

	

}
