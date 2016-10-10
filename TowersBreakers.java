//The Question for this solution can be found at https://www.hackerrank.com/challenges/tower-breakers-1

import java.util.Scanner;

public class TowersBreakers {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int testCases, n, m;
        Scanner sc = new Scanner(System.in);
        testCases = sc.nextInt();
        for(int i = 0; i < testCases; i++){
            n = sc.nextInt();
            m = sc.nextInt();
            int result = (m == 1 || n % 2 == 0 ? 2 : 1);
            System.out.println(result);
        }
        sc.close();
    }
}
