//The Question for this solution can be found at https://www.hackerrank.com/challenges/nimble-game-1

import java.util.Scanner;

public class NimbleGame {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases-- > 0) {
            int n = sc.nextInt();
            int value = 0;
            for (int i = 0; i < n; i++){ 
                if (sc.nextInt() % 2 == 1)value ^= i;
            }
            if (value == 0)
                System.out.println("Second");
            else
                System.out.println("First");
        }
        sc.close();
        
    }
}