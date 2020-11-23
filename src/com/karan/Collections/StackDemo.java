package com.karan.Collections;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Functioning of Stack and various operations such as
		// 1.	Insert
		// 2.	Delete
		// 3.	Update
		// 4.	Iterate

		Stack<Integer> listStack = new Stack<Integer>();
		listStack.push(11);
		listStack.push(12);
		listStack.push(13);
		listStack.push(14);
		listStack.push(15);
		listStack.push(16);
		listStack.push(17);
		listStack.push(18);
		listStack.push(19);
		listStack.push(20);
		
		System.out.println(listStack+"   \n");
		
		//To get top element of stack
		System.out.println("TOP ELEMENT = "+ listStack.peek());
		System.out.println("POP ELEMENT = "+ listStack.pop());
		System.out.println("TOP ELEMENT = "+ listStack.peek());
		
		//Iteration through stack will give normal insertion order and not the LIFO order
		Iterator<Integer> itr = listStack.iterator();
		while(itr.hasNext()) 
			System.out.print(itr.next()+ "  ");
		
		
		listStack.set(0, 100);
		System.out.println("\n"+listStack);
		System.out.println("TOP ELEMENT = "+ listStack.peek());
	}

}
