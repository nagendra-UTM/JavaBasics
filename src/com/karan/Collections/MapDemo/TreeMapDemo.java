package com.karan.Collections.MapDemo;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Java TreeMap class is a red-black tree based implementation. 
		//It provides an efficient means of storing key-value pairs in sorted order. 
		//Java TreeMap maintains ascending order.
		// Here order is preserved
		
		Map<Integer, String> m = new TreeMap<>();
		m.put(1, "ABC");
		m.put(21, "ABC");
		m.put(34, "ZSE");
		m.put(24, "value");
		m.put(12, "OER");
		m.put(15, "OER");
		// --------------------------
		m.put(31, "OER");
		m.put(31, "ABCDE");
		// --------------------------
		
		System.out.println(m);
		
		m.replace(1, "ABCD");
		System.out.println(m);
		
		System.out.println();
		for(Map.Entry a: m.entrySet()) {
			System.out.print(a.getKey()+" "+a.getValue()+"\n");
		}

	}

}
