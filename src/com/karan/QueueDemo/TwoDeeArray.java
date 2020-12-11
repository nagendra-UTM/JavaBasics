package com.karan.QueueDemo;

public class TwoDeeArray {

	public static void main(String[] args) {

		int i, j;
		int[][] a = {
				{31,42,53,64},
				{11,12,13,14},
				{51,21,31,41},
		};
		
		long b=400000099;
		long c = b*b;
		if(b > a[0][0]) {
			System.out.println(b*b+ " \n\n"+ c);
		}
		
		for(i=0; i<a.length; i++) {
			for(j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+ "  ");
			}
			System.out.println();
		}
		
		
//		10 3nb = 
	}

}
