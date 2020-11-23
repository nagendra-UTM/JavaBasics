package com.karan.QueueDemo;

import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {

		Queue<Integer> pq = new PriorityQueue<>();
		
		pq.add(6);
		pq.add(3);
		pq.add(1);
		pq.add(13);
		pq.add(25);
		pq.add(22);
		pq.add(19);
		pq.add(91);
		pq.add(100);
		
		System.out.println(pq);
		
		pq.remove();
		System.out.println(pq);
		pq.remove();
		System.out.println(pq);
		pq.add(21);
		System.out.println(pq);
		
		
		
	}

}
