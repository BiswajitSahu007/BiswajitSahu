package com.cpg.streamapimethods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestB {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(24);
		a1.add(44);
		a1.add(21);
		a1.add(78);
		a1.add(87);
		a1.add(54);
		a1.add(80);
		
		//FOR FILTERRATION
		List l1=a1.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l1);
		
		//TO MODIFY
		List l2=a1.stream().map(i->i*100).collect(Collectors.toList());
		System.out.println(l2);
		
		
	}

}
