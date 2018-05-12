// Question: https://www.hackerrank.com/challenges/drawing-book/problem

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class DrawingBook {

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {
        /*
         * Write your code here.
         */
        if((p == 1) || (p == n) || ((n % 2 != 0) && (p == n-1 ))) {
            return 0;
        } else {
            int fromStart = 0;
            int fromEnd = 0;
            fromStart = ((p - 1) % 2 == 0) ? ((p - 1) / 2) : (((p - 1) / 2) + 1);
            if(n % 2 == 0)
                fromEnd = ((n - p) % 2 == 0) ? ((n - p) / 2) : (((n - p) / 2) + 1);
            else
                fromEnd = (n - p) / 2;
            return (fromEnd >= fromStart) ? fromStart : fromEnd;
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int result = pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
