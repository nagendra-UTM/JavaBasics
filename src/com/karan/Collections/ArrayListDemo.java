package com.karan.Collections;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		// Functioning of ArrayList and various operations such as
		// 1.	Insert
		// 2.	Delete
		// 3.	Update
		// 4.	Iterate
		
		List<Integer> list = new ArrayList<Integer>();
		
		// Insert
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(100);
		list.add(110);
		
		
		// Iterate all the list elements using for Loop
		for(Integer i : list) {
			System.out.print(i+ "  ");
		}
		System.out.println();
		
		// Iterate all the elements using streams
		list.stream().forEach(item-> System.out.print(item + "  "));
		System.out.println();
		
		// Delete the element 100 from the list
		list.removeIf(item -> item>100);
		list.stream().forEach(item-> System.out.print(item + "  "));
		System.out.println();
		list.remove(list.size()-2);
		list.stream().forEach(item-> System.out.print(item + "  "));
		System.out.println();
		
		
		// update the element 60 with 90
		list.set(5 , 90);
		list.stream().forEach(item-> System.out.print(item + "  "));
		System.out.println();
		
		
		// Iterate the list with iterator
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+ "  ");
		}
		System.out.println();
	}

}
