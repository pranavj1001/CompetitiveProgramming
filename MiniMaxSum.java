//The Question for this solution can be found at https://www.hackerrank.com/challenges/mini-max-sum

import java.util.Scanner;

public class MiniMaxSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] array = new long[5];
        long max, min, sum = 0;
        array[0] = sc.nextLong();
        max = array[0];
        min = array[0];
        sum += array[0];
        for(int i = 1; i < 5; i++){
            array[i] = sc.nextLong();
            if(array[i]>max)
                max = array[i];
            if(array[i]<min)
                min = array[i];
            sum += array[i];
        }
        System.out.println(String.valueOf(sum-max) + " " + String.valueOf(sum-min));
        sc.close();
    }
}
