//The Question for this solution can be found at https://www.hackerrank.com/challenges/a-chessboard-game-1

import java.util.Scanner;

public class ChessBoardGame {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int testCases;
        Scanner sc = new Scanner(System.in);
        testCases = sc.nextInt();
        for(int i=0; i < testCases; i++){
            int x,y;
            x = sc.nextInt();
            y = sc.nextInt();
            x = x % 4; 
            y = y % 4;
            if((y==0)||(y==3)||(x==0)||(x==3))
                System.out.println("First");
            else
                System.out.println("Second");
        }
        sc.close();
    }
}
