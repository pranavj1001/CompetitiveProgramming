# Problem Statement: https://www.hackerrank.com/challenges/big-sorting/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BigSorting {
    
    static class Sort implements Comparator<String>{
    
        public int compare(String a, String b){
            if(a.length()==b.length()){
                return a.compareTo(b);
            }
            else
                return a.length()>b.length()?1:-1;
        }
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        ArrayList<String> list = new ArrayList<String>(n);
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
            list.add(unsorted[unsorted_i]);
        }
        // your code goes here
        Collections.sort(list, new Sort());
        for(String x : list)
            System.out.println(x);
    }
}
