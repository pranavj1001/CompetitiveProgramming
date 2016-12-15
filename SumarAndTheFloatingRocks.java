//The Question for this solution can be found at https://www.hackerrank.com/challenges/harry-potter-and-the-floating-rocks

import java.util.Scanner;

public class SumarAndTheFloatingRocks {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases-->0){
            int x1,x2,y1,y2;
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            System.out.println(gcd(Math.abs(y2 - y1), Math.abs(x2 - x1)) - 1);
        }
        sc.close();
    }
    
    private static int gcd(int y, int x){
        if(x != 0)
            return gcd(x, y%x);
        else
            return y;
    }
    
}