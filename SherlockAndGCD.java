//The Question for this solution can be found at https://www.hackerrank.com/challenges/sherlock-and-gcd

import java.util.Scanner;

public class SherlockAndGCD {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int testCases =  sc.nextInt();
        while(testCases-->0){
            int n, a, gcd = 0;
            n = sc.nextInt();
            for(int i=0; i<n; i++){
                a = sc.nextInt();
                gcd = gcd(gcd, a);
            }
            if(gcd == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
    
    private static int gcd(int x, int y){
        return (y == 0 ? x : gcd(y, x%y));
    }
    
}