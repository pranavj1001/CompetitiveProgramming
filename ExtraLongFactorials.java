// Question: https://www.hackerrank.com/challenges/extra-long-factorials/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ExtraLongFactorials {

    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Collections.nCopies(1000, 0));
        int resultSize = 1;
        arrayList.set(0, 1);
        for (int i = 2; i <= n; i++) {
            resultSize = calculate(i, arrayList, resultSize);
        }
        String factorial = "";
        for(int i = resultSize - 1; i >= 0; i--) {
            factorial += arrayList.get(i);
        }
        System.out.println(factorial);
    }
    
    static int calculate(int i, ArrayList<Integer> arrayList, int resultSize) {
        int carry = 0;
        for(int j = 0; j < resultSize; j++) {
            int mul = arrayList.get(j) * i + carry;
            arrayList.set(j, mul % 10);
            carry = (int) (mul / 10);
        }
        while(carry != 0) {
            arrayList.set(resultSize, carry % 10);
            carry = (int) (carry / 10);
            resultSize++;
        }
        return resultSize;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        int n = scanner.nextInt();
        extraLongFactorials(n);
        scanner.close();
    }
}
