// Question for this problem: https://www.hackerrank.com/challenges/the-birthday-bar/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BirthdayChocolate {

    static int solve(int n, int[] s, int d, int m){
        // Complete this function
        int ways = 0;
        int pos = 0;
        for(int val: s){
            int sum = 0;
            for(int i = pos; i < m + pos; i++){
                if(i < s.length)
                    sum += s[i];
            }
            pos++;
            if(sum == d)
                ways++;
        }
        return ways;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}
