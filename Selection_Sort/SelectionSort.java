package com.company;

public class SelectionSort {

    public static void main(String[] args) {
	// write your code here
        int[] array= {12,1,44,56,78,4,1};
        int minindex = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = i; j < array.length; j++){
                if(array[j] < array[minindex]) minindex = j;
            }
            swap(array, i, minindex);
        }
        for(int i=0; i<array.length; i++)
            System.out.println(array[i]);
    }
    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
