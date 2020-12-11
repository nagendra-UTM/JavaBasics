package com.karan.Java8;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    
    static int getMedian(int[] count, int d){
        
        int i, freq[], val, index=0;
        freq = new int[201];
        freq[0] = count[0];
        for(i=1; i<201; i++){
            freq[i] = freq[i-1] + count[i];
        }
        
        val = (d/2);
        if(d%2 == 0) {
            int firstIndex=0;
            for(i=0; i<201; ){
                if( freq[i] < val  ){
                    i++;
                } else {
                    firstIndex = i;
                    break;
                }
//                System.out.println("In even modulo");
            }
            for(i=firstIndex+1; i<201; ){
                if( freq[i] <= val  ){
                    i++;
                } else {
                    index = i;
                    break;
                }
            }
//            System.out.println("THis is fitem : "+ firstIndex+ "  and index : " + index);
            return (index+firstIndex);
        } else {
            val++;
            for(i=0; i<201; ){
                if( freq[i] < val  ){
                    i++;
                } else {
                    index = i;
                    break;
                }
//                System.out.println("In odd modulo");
            }
            System.out.println("THis is item : "+ index*2);
            return (index*2);
        }    
        
    }

    // Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditure, int d) {
        
        int n=expenditure.length, i, count[], notice=0, median, rm, ele;
        count = new int[201];
        
        Queue<Integer> arrayQ = new ArrayDeque<Integer>();
        
        for(i=0; i<d; i++){
            arrayQ.add(expenditure[i]);
            count[expenditure[i]]++;
        }
        
        for(i=d; i<n; i++){
//        	System.out.println("In the Main");
            ele = expenditure[i];
            median = getMedian(count, d);
            if(ele>=median){
                notice++;
            }
            
            rm = arrayQ.remove();
            count[rm]--;
            arrayQ.add(ele);
            count[ele]++;
            
        }
        return notice;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] expenditure = new int[n];

        String[] expenditureItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int expenditureItem = Integer.parseInt(expenditureItems[i]);
            expenditure[i] = expenditureItem;
        }

        int result = activityNotifications(expenditure, d);
        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
