package com.pranavjain.programming;

import java.util.HashSet;
import java.util.Set;

public class DuplicateEntries {

    public static void main(String[] args){

        int[] array = {1, 7, 29, 43, 3, 8 , 7, 1};

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < array.length; i++){
            if(set.contains(array[i])){
                System.out.println("Duplicate found");
                break;
            }
            set.add(array[i]);
        }

    }

}
