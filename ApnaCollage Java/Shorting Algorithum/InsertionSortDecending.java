package SortingAlgorithum;

import java.util.Arrays;

public class InsertionSortDecending {

    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int crr = arr[i];
            int prev = i - 1;
            // finding out correct pos to insert
            while (prev >= 0 && arr[prev] < crr) { 
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev + 1] = crr;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = { 1, 9, 5, 4, 7 };
        insertionSort(arr);
    }
}
