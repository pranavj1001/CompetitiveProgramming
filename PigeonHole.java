//The Question for this solution can be found at https://www.hackerrank.com/challenges/maximum-draws

import java.util.Scanner;

public class PigeonHole {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int j;
            j = sc.nextInt();
            System.out.println(j+1);
        }
        sc.close();
    }
}