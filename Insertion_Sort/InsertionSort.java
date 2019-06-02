package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array = {1,22,-12,0,99,-7};
        for( int i=1; i<array.length; i++){
            int newelement = array[i];
            int j;
            for(j=i; j>0 && newelement < array[j-1];j--){
                array[j] = array[j-1];
            }
            array[j] = newelement;
        }
        for( int i=0; i<array.length; i++)
            System.out.println(array[i]);
    }
}
