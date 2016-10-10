//The Question for this solution can be found at https://www.hackerrank.com/challenges/game-of-stones-1

import java.util.Scanner;

public class GameOfStones {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int testCases;
        Scanner sc = new Scanner(System.in);
        testCases = sc.nextInt();
        for(int i = 0; i < testCases; i++ ){
            if((sc.nextInt() % 7) > 1){
                System.out.println("First");
            }else{
                System.out.println("Second");
            }  
        }
        sc.close();
    }
}
