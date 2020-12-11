package com.karan.Java8;

import java.util.*;
import java.util.stream.*;

public class ArrayFromListUsingStream {

	public static void main(String[] args) {
		
		List<Integer> B = new ArrayList<>();
		
		B.add(-5);
		B.add(15);
		B.add(-51);
		B.add(3);
		B.add(24);
		List<Integer> A = (List<Integer>) ((ArrayList<Integer>) B).clone();
		System.out.println(Math.abs(Math.abs(-15)-Math.abs(130)));
		
	}

}