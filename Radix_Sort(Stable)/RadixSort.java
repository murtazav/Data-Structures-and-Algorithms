package com.company;

public class RadixSort {

    public static void main(String[] args) {
	// write your code here
        int[] array = {2234,4451,3445,3345,4321,1009,7464};
        radixsort(array, 10, 4);
        for (int value : array) System.out.println(value);
    }
    public static void radixsort(int[] arr, int radix, int width){
        for(int i=0;i<width;i++)
            radixsinglesort(arr, i, radix);
    }
    public static void radixsinglesort(int[] arr, int position, int radix){
        int[] cntarr = new int[radix];
        for(int i:arr) cntarr[getDigit(i, position, radix)]++;

        for(int j =1;j<cntarr.length;j++){
            cntarr[j] +=cntarr[j-1];
        }
        int[] temp = new int[arr.length];
        for(int k = arr.length-1;k>=0;k--){
            temp[--cntarr[getDigit(arr[k], position, radix)]]=arr[k];
        }
        System.arraycopy(temp,0,arr,0,arr.length);

    }
    public static int getDigit(int value, int pos, int radix){
        return value/(int)Math.pow(10, pos) % radix;
    }
}
