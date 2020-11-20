package com.karan.Java8;

interface one {
	public void add(int a, int b);
}

public class FunctionalInterface{

	public static void main(String[] args) {
		one o = (a, b) -> System.out.println("The sum  = " + (a+b)+ "\n");
		
		o.add(5, 15);
		o.add(29, 1);
	}

}
