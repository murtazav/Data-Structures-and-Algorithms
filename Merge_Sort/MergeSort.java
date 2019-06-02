package com.company;

public class MergeSort {

    public static void main(String[] args) {
	// write your code here
        int[] array = {22,-2,27,66,54,34,2,23,1,27};
        mergesort(array, 0, array.length);
        for(int i=0; i<array.length; i++)
            System.out.println(array[i]);
    }
    public static void mergesort(int[] arr, int start, int end){
        if((end - start)<2)
            return;
        int mid = (start+end)/2;
        mergesort(arr, start, mid);
        mergesort(arr, mid, end);
        merge(arr, start, mid, end);
    }
    public static void merge(int[] arr, int start, int mid, int end){
        if(arr[mid-1] <= arr[mid]) {
            return;
        }
        int i = start;
        int j = mid;
        int k = 0;
        int[] temp = new int[end-start];
        while(i<mid && j<end){
            temp[k++] = arr[i] <= arr[j] ? arr[i++]:arr[j++];
        }
        System.arraycopy(arr, i, arr, start + k, mid-i);
        System.arraycopy(temp, 0, arr, start, k);
    }
}
