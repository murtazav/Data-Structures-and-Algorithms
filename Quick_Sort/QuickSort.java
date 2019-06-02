package com.company;

public class QuickSort {

    public static void main(String[] args) {
	// write your code here
        int[] array = {33,5,4,5,22,-9,8,33,41,-87};
        quicksort(array, 0, array.length);
        for(int i = 0;i<array.length;i++)
            System.out.println(array[i]);
    }
    public static void quicksort(int[] arr, int start, int end){
        if(end-start<2)
            return;
        int pivot_index = pivot(arr, start, end);
        quicksort(arr, start, pivot_index);
        quicksort(arr, pivot_index+1, end);
    }
    public static int pivot(int[] arr, int start, int end){
        int p = arr[start];
        int i = start;
        int j = end;
        while(i<j){
            while(i<j && arr[--j]>=p);
            if(i<j) arr[i]=arr[j];
            while(i<j && arr[++i]<=p);
            if(i<j) arr[j]=arr[i];
        }
        return i;
    }
}
