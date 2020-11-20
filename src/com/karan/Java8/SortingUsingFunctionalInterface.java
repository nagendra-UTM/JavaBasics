package com.karan.Java8;

import java.util.Comparator;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.Collections;

interface SortUsingInterface extends Comparator<Integer> {
	int compare(Integer o1, Integer o2);
}

class SortUsingClass implements Comparator<Integer> {
	public int compare(Integer o1, Integer o2) {
		return o1 < o2 ? -1 : o1 > o2 ? 1 : 0;
	}
}

public class SortingUsingFunctionalInterface {

	static ArrayList<Integer> numbers = new ArrayList<Integer>();
	
	public static void assign() {
		for (int loop=ThreadLocalRandom.current().nextInt(5, 15); loop>=0; loop--) {
			numbers.add(ThreadLocalRandom.current().nextInt(20, 40));
		}
	}
	
	public static void main(String[] args) {
		SortingUsingFunctionalInterface.assign();
		System.out.println("----------Array before sorting---------- \n"+ numbers);
		Collections.sort(numbers, new SortUsingClass());
		System.out.println("----------Array after sorting using Class----------\n"+ numbers);
		
		System.out.println("\n\n");
		
		
		numbers = new ArrayList<Integer>();
		SortingUsingFunctionalInterface.assign();
		System.out.println("----------Array before sorting---------- \n"+ numbers);
		SortUsingInterface sui = (a, b) -> { return a < b ? -1 : a > b ? 1 : 0; };
		
		Collections.sort(numbers, sui);
		System.out.println("----------Array after sorting using Inteface----------\n"+ numbers);
		
		System.out.println("\n\n");
		
		
		numbers = new ArrayList<Integer>();
		SortingUsingFunctionalInterface.assign();
		System.out.println("----------Array before sorting---------- \n"+ numbers);
		Comparator<Integer> c = (a, b) -> { return a < b ? -1 : a > b ? 1 : 0; };
		Collections.sort(numbers, c);
		System.out.println("----------Array after sorting using Comparator----------\n"+ numbers);
		
		System.out.println("\n\n");
		
 	}

}
