//The Question for this solution can be found at https://www.hackerrank.com/challenges/sock-merchant

import java.util.Arrays;
import java.util.Scanner;

public class StockMerchant {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        Arrays.sort(c);
        int t=0;
        for (int i=0;i<n-1;i++){
            if(c[i]==c[i+1]){
                t++;
                i++;
            }
        }
        System.out.println(t);
        in.close();
    }
}
