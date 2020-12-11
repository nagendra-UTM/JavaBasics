package com.karan.Java8;

import java.util.Scanner;

public class StringUsage {

	public static void main(String[] args) {
		String s = "TODO Auto-generated method stub";
		String t = "TODO Auto-generated method stuba";
		
		System.out.println(s.length()+ "   "+ s.charAt(5)+"  "+ s.equals(t));
		System.out.println(s.compareTo(t));
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		System.out.println(l);
	}

}
