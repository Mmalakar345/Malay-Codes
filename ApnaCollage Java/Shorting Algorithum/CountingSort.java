package SortingAlgorithum;

import java.util.Arrays;

public class CountingSort {
    public static void countingSort(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int [] count = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        System.out.println(Arrays.toString(count));
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 3, 5, 3, 8, 1 };
        countingSort(arr);
    }

}
