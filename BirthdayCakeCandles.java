import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BirthdayCakeCandles {

    static int birthdayCakeCandles(int n, int[] ar) {

        Map<Integer, Integer> candles = new HashMap<Integer, Integer>();
        for(int height: ar){
            if(candles.containsKey(height)){
                candles.put(height, candles.get(height) + 1);
            }else{
                candles.put(height, 1);
            }
        }

        int max = 0;

        for(Map.Entry<Integer, Integer> entry: candles.entrySet()){
            int value = entry.getValue();
            if(max < value)
                max = value;
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
