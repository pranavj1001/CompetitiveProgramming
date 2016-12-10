//The Question for this solution can be found at https://www.hackerrank.com/challenges/closest-number

import java.util.Scanner;

public class ClosestNumber {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a, b, x, testCases;
        long target, temp1, temp2;
        testCases = sc.nextInt();
        while(testCases-->0){
            a = sc.nextInt();
            b = sc.nextInt();
            x = sc.nextInt();
            target = (long) Math.pow(a,b);
            temp1 = target - (target%x); 
            temp2 = target + (x - (target%x));   
            if((x - (target%x)) >= (target%x))          
                System.out.println(temp1); 
            else
                System.out.println(temp2);
        }
        sc.close();
    }
}