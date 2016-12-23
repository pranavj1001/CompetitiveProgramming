//The Question for this solution can be found at https://www.hackerrank.com/challenges/a-very-big-sum

import java.util.Scanner;

public class AVeryBigSum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        while(n-->0)
            sum += sc.nextLong();
        System.out.println(sum);
        sc.close();
    }
}