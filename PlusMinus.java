//The Question for this solution can be found at https://www.hackerrank.com/challenges/plus-minus

import java.util.Scanner;

public class PlusMinus {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int c1 = 0, c2 = 0, c3 = 0;
        double pos = 0.0, neg = 0.0, zero = 0.0;
        for(int i = 0; i < n; i++)
            array[i] = sc.nextInt();
        
        for(int x : array){
            if(x > 0)
                c1++;
            else if (x == 0)
                c3++;
            else
                c2++;
        }
        
        pos = (double) c1/n;
        neg = (double) c2/n;
        zero = (double) c3/n;
        System.out.println(pos + "\n" + neg + "\n" + zero);
        sc.close();
        
    }
}