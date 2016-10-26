//The Question for this solution can be found at https://www.hackerrank.com/challenges/poker-nim-1

import java.util.Scanner;

public class PokerNim {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases-->0)
        {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int b = 0;
            while(n-->0)
            {
                b ^= sc.nextInt();
            }

            if(b == 0)
                System.out.println("Second");
            else
                System.out.println("First");
        }
        sc.close();
    }
}