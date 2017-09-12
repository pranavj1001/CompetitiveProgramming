// Question for this problem: https://www.hackerrank.com/challenges/grading/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades){
        // Complete this function
        int[] finalGrades = new int[grades.length];
        int pos = 0;
        for(int grade : grades){
            if(!(grade < 38) && !(grade % 5 < 3)){
                grade += (5 - (grade % 5 ));
            }
            finalGrades[pos] = grade;
            pos++;
        }
        return finalGrades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}
