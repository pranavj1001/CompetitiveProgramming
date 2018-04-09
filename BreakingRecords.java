package com.pranavjain.programming;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class BreakingRecords {

    /*
     * Complete the breakingRecords function below.
     */
    static int[] breakingRecords(int[] score) {
        /*
         * Write your code here.
         */
        int[] maxmin = new int[2];
        maxmin[0] = maxmin[1] = 0;
        if(score.length == 0 || score.length == 1) return maxmin;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(score[0]);
        int min = score[0];
        int max = score[0];

        for(int i = 1; i < score.length; i++) {
            if(!list.contains(score[i])) {
                if(max < score[i]) {
                    maxmin[0]++;
                    max = score[i];
                }
                if(min > score[i]) {
                    maxmin[1]++;
                    min = score[i];
                }
                list.add(score[i]);
            }
        }

        return maxmin;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] score = new int[n];

        String[] scoreItems = scan.nextLine().split(" ");

        for (int scoreItr = 0; scoreItr < n; scoreItr++) {
            int scoreItem = Integer.parseInt(scoreItems[scoreItr].trim());
            score[scoreItr] = scoreItem;
        }

        int[] result = breakingRecords(score);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write(" ");
            }
        }

        bw.newLine();

        bw.close();
    }
}

