//The Question for this solution can be found at https://www.hackerrank.com/challenges/is-fibo


import java.util.HashSet;
import java.util.Scanner;

public class IsFibo {
    
    static HashSet<Long> fibs = new HashSet<Long>();
    public static void main(String[] args) {
    	/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        long max = 10000000000l;
        long a = 1, b = 1, c;
        fibs.add(0l);
        fibs.add(1l);
        do{
            c = a+b;
            fibs.add(c);
            a = b;
            b = c;
        }while(c <= max);
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases-->0) 
            System.out.println(isFib(sc.nextLong()));
        sc.close();
    }
    
    private static String isFib(long n){
        return fibs.contains(n)? "IsFibo":"IsNotFibo";
    }  
}