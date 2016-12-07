//The Question for this solution can be found at https://www.hackerrank.com/challenges/sherlock-and-divisors

import java.util.Scanner;
import java.math.*;

public class SherlockAndDivisors {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases-->0){
            long num = sc.nextLong(), count = 0;
            if(num%2 == 0){
                count++;
                for (int i = 2; i <= Math.sqrt(num); i++){
                    if(num%i==0 && i%2==0)
                        count++;
                    if(num%(num/i)==0 && ((num/i)!=i) && ((num/i)%2==0))
                        count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}