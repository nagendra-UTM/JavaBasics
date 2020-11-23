package com.karan.Collections.List;

import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		// Functioning of LinkedList and various operations such as
		// 1.	Insert
		// 2.	Delete
		// 3.	Update
		// 4.	Iterate

		List<String> list = new LinkedList<String>();
		
		//Insert
		list.add("ABC");
		list.add("ABC");
		list.add("BCD");
		list.add("CDE");
		list.add("DEF");
		list.add("EFG");
		list.add("FGH");
		list.add("GHI");
		list.add("HIJ");
		list.add("IJK");
		list.add("KLM");
		
		// Iterate Linked List using iterator
		Iterator<String> itr = list.listIterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+ "  ");
		}
		System.out.println();
		
		// Delete
		list.remove("ABC");
		list.stream().forEach(item->System.out.print(item+ "  "));
		System.out.println();
		
		
		// Update
		for(int i=0; i<list.size(); i++) {
			if( list.get(i) == "ABC") 
				list.set(i, "AAA");
		}
		list.stream().forEach(item->System.out.print(item+ "  "));
	}

}
