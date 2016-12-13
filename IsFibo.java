//The Question for this solution can be found at https://www.hackerrank.com/challenges/is-fibo

import java.util.Scanner;

public class IsFibo {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases-->0){
            long n = sc.nextInt();
            System.out.println(Fibonacci(n));
        }
        sc.close();
    }
    
    public static String Fibonacci(long n) {
        long fib1 = 0;
        long fib2 = 1;
        do {
            long temp = fib1;
            fib1 = fib2;
            fib2 = temp + fib2;
            }
        while (fib2 < n);

        if (fib2 == n)
            return "IsFibo";
        else
            return "IsNotFibo";
    }
    
}