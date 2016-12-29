//The Question for this solution can be found at https://www.hackerrank.com/challenges/apple-and-orange

import java.util.Scanner;

public class AppleAndOrange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        int apples = 0, oranges = 0;
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
            if(a+apple[apple_i]>=s && a+apple[apple_i]<=t) 
                apples++;
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            if(b+orange[orange_i]>=s && b+orange[orange_i]<=t) 
                oranges++;
        }
        System.out.println(apples);
        System.out.println(oranges);
        in.close();
    }
}
