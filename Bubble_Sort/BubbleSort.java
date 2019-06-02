package com.company;

public class BubbleSort {

    public static void main(String[] args) {
	// write your code here
        int[] array = {7, 8, 55, 9, 82, 1, 7};
        for(int i = array.length-1; i >0; i--){
            for( int j=0; j<i; j++)
                if(array[j] > array[j+1])
                    swap(array, j, j+1);
        }
        for (int i=0; i<array.length; i++)
            System.out.println(array[i]);
    }
    public static void swap(int[] intarray, int i, int j){
        if (i == j)
            return;
        int temp = intarray[i];
        intarray[i] = intarray[j];
        intarray[j] = temp;
    }
}
