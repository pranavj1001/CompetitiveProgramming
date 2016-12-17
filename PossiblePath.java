//The Question for this solution can be found at https://www.hackerrank.com/challenges/possible-path

import java.util.Scanner;

public class PossiblePath {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases-->0){
            int a, b, x, y;
            a = sc.nextInt();
            b = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();
            if(gcd(Math.abs(a), Math.abs(b)) == gcd(Math.abs(x), Math.abs(y)))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();     
    }
    
    private static int gcd(int n1, int n2){
            return n2 == 0 ? n1 : gcd(n2, n1 % n2);
    }
    
}