package com.cpg.queue.priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {

	public static void main(String[] args) {
	Queue p1=new PriorityQueue();
	p1.offer(12);
	p1.offer(32);
	p1.offer(42);
	p1.offer(52);
	p1.offer(62);
	p1.offer(2);
	System.out.println(p1);
	p1.poll();
	p1.poll();
	System.out.println(p1);
	
	for (Object object : p1) {
		System.out.println(object);
	}
	}

}
