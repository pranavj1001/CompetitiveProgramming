//The Question for this solution can be found at https://www.hackerrank.com/challenges/compare-the-triplets

import java.util.Scanner;

public class CompareTheTriplets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int aScore = 0, bScore = 0;
        if(a0 > b0)
            aScore++;
        else if( b0 > a0)
            bScore++;
        if(a1 > b1)
            aScore++;
        else if( b1 > a1)
            bScore++;
        if(a2 > b2)
            aScore++;
        else if( b2 > a2)
            bScore++;
        System.out.println(aScore + " " + bScore);
        in.close();
    }
}
