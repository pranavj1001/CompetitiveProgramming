// Question: https://www.hackerrank.com/challenges/permutation-equation/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SequenceEquation {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] pInverse = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int pi = scan.nextInt();
            pInverse[pi] = i;
        }
        scan.close();
        
        for (int i = 1; i <= n; i++) {
            int j = pInverse[pInverse[i]];
            System.out.println(j);
        }
    }
}
