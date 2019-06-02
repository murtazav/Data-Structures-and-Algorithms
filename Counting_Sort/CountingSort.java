package com.company;

public class CountingSort {

    public static void main(String[] args) {
        // write your code here
        int[] array = {2, 2, 3, 10, 9, 4, 5, 4, 9, 7, 6, 3};
        int[] cntarr = new int[10];
        for (int i = 0; i < array.length; i++) {
            cntarr[array[i] - 1]++;
        }
        int j = 0, i = 0;
        while (j < cntarr.length) {
            for (int k = cntarr[j]; k > 0 && i < array.length; k--) {
                array[i] = j + 1;
                i++;
            }
            j++;
        }
        for(i = 0; i < array.length; i++)
            System.out.println(array[i]);

    }
}
