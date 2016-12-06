//The Question for this solution can be found at https://www.hackerrank.com/challenges/reverse-game

import java.util.Scanner;

public class ReverseGame {
    
    static int n, pos;

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases-->0){
            n = sc.nextInt();
            pos = sc.nextInt();
            for(int i = 0; i < n; i++){
                if(pos < i) break;
                else reverse(i);
            }
            System.out.println(pos);
        }
        sc.close();
    }
    private static void reverse(int i){
        pos = pos - i;
        pos = n - i - 1 - pos;
        pos = pos + i;
        return;
    }
}