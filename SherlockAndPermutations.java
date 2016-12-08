//The Question for this solution can be found at https://www.hackerrank.com/challenges/sherlock-and-permutations

import java.util.Scanner;
import java.math.BigInteger;

public class SherlockAndPermutations {

     public static BigInteger factorial(int n) {  
        BigInteger fact = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(new BigInteger(i + ""));
        }
        return fact;
    }

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int testCases = sc.nextInt(); 
        while(testCases-->0) { 
            int zeros = sc.nextInt(); 
            int ones = sc.nextInt();

            if(ones==1)
                System.out.println(1);
            else{
                int x = zeros + ones - 1;
                int y = ones - 1;
                BigInteger n1 = factorial(x);
                BigInteger n2 = factorial(y);
                BigInteger n3 = factorial(zeros);
                BigInteger n4 = n1.divide(n2.multiply(n3));
                BigInteger bi[] = n4.divideAndRemainder(BigInteger.valueOf(1000000007));
                System.out.println(bi[1]);
            }
        }
        sc.close();
    }
}