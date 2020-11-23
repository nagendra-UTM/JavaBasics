package com.karan.Collections.SetDemo;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<Integer> tree = new TreeSet<>();
		
		// Functioning of TreeSet and various operations such as
		// 1.	Insert
		// 2.	Delete
		// 3.	Iterate
		// Its sorts the input while inserting the elements into it
		
		tree.add(100);
		tree.add(29);
		tree.add(3);
		tree.add(41);
		tree.add(779);
		tree.add(87);
		tree.add(46);
		tree.add(91);
		tree.add(67);
		tree.add(19);
		tree.add(21);
		
		System.out.println(tree);
		
		// Deleting one of the element 21
		tree.remove(21);
		System.out.println(tree);
		
		
		// Here update is not possible bcz its a set and it could be updated by removing the element
		// and then inserting the new element into the set
		
		// Iteration using streams and iterator
		tree.stream().forEach(item-> System.out.print(item+ "  "));
		System.out.println();
		Iterator<Integer> i = tree.iterator();
		while(i.hasNext())
			System.out.print(i.next()+ "  ");
		
		
	}

}
