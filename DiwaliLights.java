//The Question for this solution can be found at https://www.hackerrank.com/challenges/diwali-lights

import java.util.Scanner;

public class DiwaliLights {

     public static void main(String[] args){
    	 /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt(), n = 0;
        long ans = 0;
        String answer = "";
        while(testCases-->0) {
            n = sc.nextInt();
            ans = 1;
            while(n-->0){
                ans *= 2;
                ans = ans % 100000;
            }
            answer += --ans + "\n";
        }
        System.out.print(answer);
        sc.close();
    }
}