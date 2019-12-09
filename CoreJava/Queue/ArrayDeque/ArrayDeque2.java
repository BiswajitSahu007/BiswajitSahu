package com.cpg.queue.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDeque2 {

	public static void main(String[] args) {
		ArrayDeque a1=new ArrayDeque();
		a1.add(22);
		a1.add(32);
		a1.addFirst(12);
		a1.add(42);
		a1.add(52);
		Iterator itr=a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
