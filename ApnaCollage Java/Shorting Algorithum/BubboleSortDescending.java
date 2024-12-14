package SortingAlgorithum;

import java.util.Arrays;

public class BubboleSortDescending {
    public static void bubboleSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = { 4, 8, 7, 1, -2 };
        int n = arr.length;
        bubboleSort(arr, n);
    }
}
