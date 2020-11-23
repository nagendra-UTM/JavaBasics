package com.karan.Collections.MapDemo;

import java.util.Map;
import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// HashMap does not preserve the order of elements and store in key value pairs
		Map<Integer, String> m = new HashMap<>();
		
		m.put(1, "ABC");
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
		
	}

}
