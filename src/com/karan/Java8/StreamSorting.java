package com.karan.Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSorting {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.println("BEfore Sorting---------"+list+"------------\n");
		
		
		for(int i=ThreadLocalRandom.current().nextInt(15, 23); i>0; i--) {
			list.add(ThreadLocalRandom.current().nextInt(24, 78));
		}
		
		System.out.println(list+ "\n\nIn Ascending Order \n");
		List<Integer> l = (ArrayList<Integer>) list.stream().sorted().collect(Collectors.toList());
		System.out.println(l+ "\n\n");
		
		//Using comparator
		l = list.stream().sorted((a,b) -> (a>b) ? 1 : (a<b) ? -1 : 0).collect(Collectors.toList());
		System.out.println(l);
		
		
		Stream.of(9, 99, 100, "Nagendra", "Karan", 200, 43).forEach(System.out::print);
	}

}
