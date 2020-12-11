package com.karan.Java8;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class InsertionSort {
	
	
	public static void change(int[] a) {
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				a[i]*=2;
			}
		}
	}

    public static void main(String[] args) {

        int n, i;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int[] a = new int[n];
        for(i=0; i<n; i++) 
        	a[i]=ThreadLocalRandom.current().nextInt(1, 100);
        
        System.out.println();
        for(i=0; i<n; ) {
        	System.out.print(a[i++]+"  ");
        }

        change(a);
       
        System.out.println();
        for(i=0; i<n; ) {
        	System.out.print(a[i++]+"  ");
        }
        	
        
    }

}
