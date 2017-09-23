// Question for this Problem: https://www.hackerrank.com/challenges/missing-numbers/problem

package com.pranavjain.programming;

import java.util.*;

public class MissingNumbers {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Map<Integer, Integer> aList = new HashMap<>();
        Map<Integer, Integer> bList = new HashMap<>();

        int n1 = sc.nextInt();
        for(int i = 0; i < n1; i++){
            int val = sc.nextInt();
            if(aList.containsKey(val)){
                aList.put(val, aList.get(val) + 1);
            }else{
                aList.put(val, 1);
            }
        }

        int n2 = sc.nextInt();
        for(int i = 0; i < n2; i++){
            int val = sc.nextInt();
            if(bList.containsKey(val)){
                bList.put(val, bList.get(val) + 1);
            }else{
                bList.put(val, 1);
            }
        }

        ArrayList<Integer> missingNumbers = new ArrayList<>(n2-n1);

        for(Map.Entry<Integer, Integer> entry : aList.entrySet()){
            int value = entry.getValue();
            int key = entry.getKey();

            if(!bList.containsKey(key)){
                missingNumbers.add(key);
            }else if(value != bList.get(key)){
                missingNumbers.add(key);
            }
        }

        Collections.sort(missingNumbers);

        for(int i = 0; i < missingNumbers.size(); i++){
            System.out.print(missingNumbers.get(i) + " ");
        }

    }

}
