package com.karan.QueueDemo;

import java.util.Queue;
import java.util.ArrayDeque;

public class ArrayQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ArrayDeque - preserves order of inserted elements
		// Deque works in the fashion of standard queue
		
		Queue<Integer> q = new ArrayDeque<>();

		q.add(43);
		q.add(1);
		q.add(34);
		q.add(35);
		q.add(23);
		q.add(21);
		q.add(19);
		
		System.out.println(q);
		q.remove();
		System.out.println(q);
		q.remove();
		System.out.println(q);
		q.add(47);
		System.out.println(q);
		q.add(89);
		System.out.println(q);
		
		System.out.println();
		
		q.stream().forEach(item -> System.out.print(item+ "  "));
		
	}

}
