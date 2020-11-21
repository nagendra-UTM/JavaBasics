package com.karan.Java8;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class StreamFilter {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=ThreadLocalRandom.current().nextInt(15, 23); i>0; i--) {
			list.add(ThreadLocalRandom.current().nextInt(24, 78));
		}
		
		System.out.println(list+ "\n\n");
		list.stream().filter(i -> i%2 !=0).map(i -> i+10).forEach(i -> System.out.print(i+ " "));
	}

}
