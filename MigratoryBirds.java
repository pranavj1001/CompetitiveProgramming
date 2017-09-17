// Question for this problem https://www.hackerrank.com/challenges/migratory-birds/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MigratoryBirds {
    
    static int migratoryBirds(int n, int[] ar) {
        // Complete this function
        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for(int val : ar){
            if(freq.containsKey(val)){
                freq.put(val, freq.get(val) + 1);
            }else{
                freq.put(val, 1);
            }
        }
        int max = 0, maxKey = 0;
        
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            int value = entry.getValue();
            int key = entry.getKey();
            if(value > max){
                maxKey = key;
                max = value;
            }
        }
        return maxKey;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
