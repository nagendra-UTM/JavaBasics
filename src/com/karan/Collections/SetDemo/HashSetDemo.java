package com.karan.Collections.SetDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> s = new HashSet<String>();
		
		// Functioning of HashSet and various operations such as
		// 1.	Insert
		// 2.	Delete
		// 3.	Iterate
		// It does not preseve the order
		
		s.add("ABC");
		s.add("ABC");
		s.add("BCD");
		s.add("BCD");
		s.add("BCD");
		s.add("EFG");
		s.add("FGH");
		s.add("GHI");
		s.add("GHI");
		s.add("IJK");
		s.add("KLM");
		
		System.out.println(s);
		
		// Deleting one of the String
		s.remove("KLM");
		System.out.println(s);
		
		// Here update is not possible bcz its a set and it could be updated by removing the element
		// and then inserting the new element into the set
		
		// Iteration using streams and iterator
		s.stream().forEach(item-> System.out.print(item+ "  "));
		System.out.println("\n\n"+ s+"\n");
		
		Iterator<String> i = s.iterator();
		while(i.hasNext())
			System.out.print(i.next()+ "  ");
		
	}

}
