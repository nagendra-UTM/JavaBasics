package com.karan.Java8;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'mostActive' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY customers as parameter.
     */

    public static List<String> mostActive(List<String> customers) {
    // Write your code here

    	long len = customers.size();
        TreeMap<String, Integer> tree = new TreeMap<>();
        
        TreeMap<String, Integer> result = new TreeMap<>();
        List<String> arr = new ArrayList<String>();
        double total = 0, check=0;
        
        for(int i=0; i<len; i++) {
            if(tree.containsKey(customers.get(i))) {
                int value = tree.get(customers.get(i));
                tree.put(customers.get(i), value+1 );
            }
            else {
                tree.put(customers.get(i), 1);
            }
        }
        
        total = ((new Integer(5*customers.size())).doubleValue()/(new Integer(100)).doubleValue());
        for(Map.Entry<String, Integer> m : tree.entrySet()) {
            
            check = (new Integer(m.getValue() * 100)).doubleValue() / (new Integer((int)len).doubleValue());
            System.out.println(check + "    "+ total);
            if ( check >= total ) {
                result.put(m.getKey(), m.getValue());
            }
        }
        
        for(Map.Entry<String, Integer> m : result.entrySet()) {
            arr.add(m.getKey());
        }
        
        return arr;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int customersCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> customers = IntStream.range(0, customersCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<String> result = Result.mostActive(customers);

        System.out.println(result.stream()
                .collect(joining("\n")));
//        bufferedWriter.write(
//            result.stream()
//                .collect(joining("\n"))
//            + "\n"
//        );

        bufferedReader.close();
//        bufferedWriter.close();
    }
}












//24
//ABC
//ABC
//PQR
//PQR
//Omega
//Alpha
//Omega
//Alpha
//Omega
//Alpha
//Omega
//Alpha
//Omega
//Alpha
//Omega
//Alpha
//Omega
//Alpha
//Omega
//Alpha
//Omega
//Alpha
//Omega
//Beta