package com.pranavjain.programming;

public class ShiftElements {

    public static void main(String[] args){

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};

        int from = 1;
        int to = 2;

        shiftElements(array, from, to);

        for(int val: array)
            System.out.print(val + " ");

    }

    private static void shiftElements(int[] array, int from, int to){

        if(from < to && to < array.length){

            int temp = array[from];

            for(int i = from; i < to; i++){
                array[i] = array[i+1];
            }

            array[to] = temp;

        }

    }

}
