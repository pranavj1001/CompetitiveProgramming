// The Question for this solution can be found at https://www.hackerrank.com/challenges/two-characters/problem
// The solution has been inspired from @rshaghoulian's answer at hackerrank

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoCharacters {
    
    public static final int NUM_LETTERS = 26;

    static int twoCharaters(String s, int l) {
        // Complete this function
        
        /* Edge case */
        if (l <= 1) {
            return 0;
        }
        
        /* Create arrays representing the 26^2 subproblems */
        int [][] pair  = new int[NUM_LETTERS][NUM_LETTERS];
        int [][] count = new int[NUM_LETTERS][NUM_LETTERS];
        
        for (int i = 0; i < l; i++) {
            char letter   = s.charAt(i);
            int letterNum = letter - 'a';
            
            /* Update row */
            for (int col = 0; col < NUM_LETTERS; col++) {
                if (pair[letterNum][col] == letter) {
                    count[letterNum][col] = -1;
                }
                if (count[letterNum][col] != -1) {
                    pair[letterNum][col] = letter;
                    count[letterNum][col]++;
                }
            }
            
            /* Update column */
            for (int row = 0; row < NUM_LETTERS; row++) {
                if (pair[row][letterNum] == letter) {
                    count[row][letterNum] = -1;
                }
                if (count[row][letterNum] != -1) {
                    pair[row][letterNum] = letter;
                    count[row][letterNum]++;
                }
            }
        }
        
        /* Find max in "count" array */
        int max = 0;
        for (int row = 0; row < NUM_LETTERS; row++) {
            for (int col = 0; col < NUM_LETTERS; col++) {
                max = Math.max(max, count[row][col]);
            }
        }
        
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        String s = in.next();
        int result = twoCharaters(s, l);
        System.out.println(result);
        in.close();
    }
}
