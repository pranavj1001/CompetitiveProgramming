// Question: https://www.hackerrank.com/challenges/find-digits/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FindDigits {

    // Complete the findDigits function below.
    static int findDigits(int n) {
        int count = 0;
        int number = n;
        while (n > 0) {
            int digit = n % 10;
            n /= 10;
            if (digit != 0) {
                if (number % digit == 0)
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            int result = findDigits(n);
            System.out.println(result);
        }
        scanner.close();
    }
}
