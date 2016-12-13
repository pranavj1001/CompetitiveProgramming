//The Question for this solution can be found at https://www.hackerrank.com/challenges/filling-jars

import java.util.Scanner;

public class FillingJars {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        long N,M,avg = 0,sum = 0;
        N = sc.nextLong();
        M = sc.nextLong();
        while(M-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long k = sc.nextLong();
            sum += (b-a+1)*k; 
        } 
        avg = sum/N;
        System.out.println(avg);
        sc.close();
    }
}