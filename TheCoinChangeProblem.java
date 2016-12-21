//The Question for this solution can be found at https://www.hackerrank.com/challenges/coin-change
import java.util.Scanner;

public class TheCoinChangeProblem {
    
    static int[] c = new int[52];
    static int numCoins;
    static long[][] table = new long[52][252];
    static boolean[][] calculated = new boolean[52][252];

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int make;
        make = sc.nextInt();
        numCoins = sc.nextInt();
        for(int i = 1; i <= numCoins; i++){
            c[i] = sc.nextInt();
        }
        System.out.println(solve(1, make));
        sc.close();
    }
    
    private static long solve(int i, int make){
        if(make < 0)
            return 0;
        if(make == 0)
            return 1;
        if(i > numCoins)
            return 0;
        if(!calculated[i][make]){
            table[i][make] = solve(i, make - c[i]) + solve(i+1, make);
            calculated[i][make] = true;
        }
        return table[i][make];
    }
    
}