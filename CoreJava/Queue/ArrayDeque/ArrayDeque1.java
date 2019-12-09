package com.cpg.queue.ArrayDeque;

import java.util.ArrayDeque;

public class ArrayDeque1 {

	public static void main(String[] args) {
		ArrayDeque ad=new ArrayDeque();
		ad.offer(new Student(22, "Biswajit"));
		ad.offer(new Student(23, "Santu"));
		ad.offer(new Student(22, "Biswajit"));
		for (Object object : ad) {
			System.out.println(object);
		}
	}

}
