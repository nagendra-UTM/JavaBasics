package com.karan.Java8;


import java.util.*;

class TestClass {

    public static long getDigitSum(long n) {
        long count=0; 
        while(n>0) {
            count += (n%10);
            n = n/10;
        }
        return count;
    }

    public static int getIndex(long B[], int index) {
        int i, j=B.length;
        long item = j>index ? B[index] : -1;
        for(i=index+1; i<j; i++){
            if(B[i] > item){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[] ) throws Exception {
        int N, Q, i, j, k;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        Q = sc.nextInt();
        long A[] = new long[N];
        long B[] = new long[N];

        for(i=0; i<N; i++){
            A[i] = sc.nextLong();
            B[i] = getDigitSum(A[i]);
        }
            
        i=0;
        while(i<Q) {
            j = sc.nextInt();
            k = getIndex(B, j);
            System.out.println(k);
            i++;
        }        
    }
}
