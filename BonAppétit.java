//The Question for this solution can be found at https://www.hackerrank.com/challenges/bon-appetit

import java.util.Scanner;

public class BonAppétit {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int ref;
        int cost = 0;
        for(int i = 0; i < n ; i++){
            a[i] = sc.nextInt();
            cost += a[i];
        }
        ref = a[k]/2;
        cost = (cost/2)-ref;
        int taken = sc.nextInt();
        if(taken==cost)
            System.out.println("Bon Appetit");
        else
            System.out.println(ref);
        sc.close();
    }
}
