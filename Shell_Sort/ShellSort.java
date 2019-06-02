package com.company;

public class ShellSort {

    public static void main(String[] args) {
	// write your code here
        int[] array = {1,22,-12,0,99,-7};

        for(int gap = array.length/2; gap>0; gap /=2){
            for(int i = gap; i<array.length; i++){
                int newelement = array[i];
                int j;
                for(j=i;j>=gap && newelement < array[j-gap];j-=gap ){
                    array[j] = array[j-gap];
                }
                array[j] = newelement;
            }
        }

        for (int value : array) System.out.println(value);
    }
}
