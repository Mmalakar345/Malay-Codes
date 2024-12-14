package SortingAlgorithum;

import java.util.Arrays;

public class SelectionSortAcending {

    public static int[] selectionSort(int[] arr, int n) {
        for (int i = 0; i < n-1; i++) {
            int minidx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minidx] > arr[j]) { //acending order detection
                    minidx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minidx];
            arr[minidx] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 8, 7, 1, -2 };
        int n = arr.length;
        System.out.println(Arrays.toString(selectionSort(arr, n)));
    }

}
