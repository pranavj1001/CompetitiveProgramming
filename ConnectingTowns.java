//The Question for this solution can be found at https://www.hackerrank.com/challenges/connecting-towns

import java.util.Scanner;

public class ConnectingTowns {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-->0) {
            int n;
            n = sc.nextInt();
            int routes = 1;
            int ni;
            for (int i = 0; i < n - 1; i++) {
                ni = sc.nextInt();
                routes = (routes*ni) % 1234567;
            }
            System.out.println(routes);
        }
        sc.close();
    }
}
