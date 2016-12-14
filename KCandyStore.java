//The Question for this solution can be found at https://www.hackerrank.com/challenges/k-candy-store

import java.util.Scanner;

public class KCandyStore {
    
    static final int max = 2003;
    static final int mod = 1000000000;

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n, r, k, testCases;
        int[][] nCr = new int[max][max];
        for(n = 0; n <= 2000; n++){
            for(r = 0; r <= n; r++){
                if(r == 0 || n == r) 
                    nCr[n][r] = 1;
                else 
                    nCr[n][r] = (nCr[n-1][r-1] + nCr[n-1][r]) % mod;
            }
        }
        testCases = sc.nextInt();
        while(testCases-->0){
            n = sc.nextInt();
            k = sc.nextInt();
            System.out.println(nCr[k+n-1][k]);
        }
        sc.close();
    }
}