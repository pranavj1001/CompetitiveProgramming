//Question: https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BeautifulDays {

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
        int count = 0;
        for (int x = i; x <= j; x++) {
            if ((x - reverse(x)) % k == 0) {
                count++;
            }
        }
        return count;
    }
    
    static int reverse(int num) {
        int reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = (reversed * 10) + digit;
            num /= 10;
        }
        return reversed;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
