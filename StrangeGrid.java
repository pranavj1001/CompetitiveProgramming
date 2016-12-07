//The Question for this solution can be found at https://www.hackerrank.com/challenges/strange-grid

import java.util.Scanner;

public class StrangeGrid {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        long row, column, x;
        row = sc.nextLong();
        column = sc.nextLong();
        if(row % 2 == 0){
            //number is odd
            x = (5*row) - 9;
        }else{
            //number is even
            x = (5*row) - 5;
        }
        x += (2 * column) - 2;
        System.out.println(x);
        sc.close();
    }
}
