//The Question for this solution can be found at https://www.hackerrank.com/challenges/halloween-party

import java.util.Scanner;

public class HalloweenParty {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases-->0){
            long n = sc.nextInt();
            System.out.println((n/2)*(n-n/2));
        }
        sc.close();
    }
}