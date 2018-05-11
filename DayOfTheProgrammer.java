// Question: https://www.hackerrank.com/challenges/day-of-the-programmer/problem

package com.pranavjain.programming;

import java.io.*;
import java.util.*;

public class DayOfTheProgrammer {

        // Complete the solve function below.
        static String solve(int year) {

            if (year == 1918) {
                return "26.09.1918";
            } else if ((year < 1918 && year % 4 == 0) || ((year > 1918) && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))) {
                return "12.09." + String.valueOf(year);
            } else {
                return "13.09." + String.valueOf(year);
            }

        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int year = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String result = solve(year);

            bufferedWriter.write(result);
            bufferedWriter.newLine();

            bufferedWriter.close();

            scanner.close();
        }

}
