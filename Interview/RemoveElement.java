package com.pranavjain.programming;

public class RemoveElement {

    public static void main(String[] args){

        int[] array = {1, 6, 75 ,8, 5, 876, 49, 13 , 57};
        boolean changed = false;

        for(int i = 0; i < array.length - 1; i++){
            if(array[i] == 6 || changed){
                array[i] = array[i+1];
                changed = true;
            }
        }
        if(changed)
            array[array.length-1] = 0;

        for(int val : array){
            System.out.print(val + " ");
        }

    }

}
