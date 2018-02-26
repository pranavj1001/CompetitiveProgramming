// Question for this program is at https://www.hackerrank.com/contests/university-codesprint-4/challenges/summer-lesson/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SummerLesson {

    static int[] howManyStudents(int m, int[] c) {
        // Return an array denoting the number of students taking each class.
        int[] array = new int[m];
        for(int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
        
        for(int x : c) {
            array[x]++;
        }
        
        return array;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] c = new int[n];
        for(int c_i = 0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int[] result = howManyStudents(m, c);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
