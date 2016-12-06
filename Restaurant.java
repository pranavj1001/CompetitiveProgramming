//The Question for this solution can be found at https://www.hackerrank.com/challenges/restaurant

import java.util.*;

public class Restaurant {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int testCases, l, b;
        testCases = sc.nextInt();
        while(testCases-->0){
            l = sc.nextInt();
            b = sc.nextInt();
            int gcd, n1 = l, n2 = b;
            while(n1 != n2){
                if(n1 > n2)
                    n1 = n1-n2;
                else
                    n2 = n2-n1;
            }
            gcd = n1;
            System.out.println((l/gcd)*(b/gcd));
        }
        sc.close();
    }
}
