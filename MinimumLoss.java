package com.pranavjain.programming;

import java.util.*;

public class MinimumLoss {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] year = new long[n];
        Map<Long,Integer> data = new HashMap<>();

        for(int i = 0 ; i< n ; i++)
            year[i] = sc.nextLong();

        for (int i = 0 ; i < n ; i++)
            data.put(year[i],i);

        Arrays.sort(year);
        long diff = year[n-1];

        for (int i = 0 ; i < n-1 ; i++){
            if (diff > year[i+1]-year[i] && data.get(year[i])-data.get(year[i+1]) > 0)
                diff = year[i+1]-year[i];
        }

        System.out.println(diff);

    }

}
