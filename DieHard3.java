//The Question for this solution can be found at https://www.hackerrank.com/challenges/die-hard-3

import java.util.Scanner;

public class DieHard3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases-->0){
            int x, y, z;
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();
            int max = (x>y?x:y);
            int gcd = gcd(x,y);
            if(max >= z && z%gcd == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
    
    private static int gcd(int x, int y){
        if(x < y)
            return gcd(y,x);
        if(y == 0)
            return x;
        else
            return gcd(y, x%y);
    }
}