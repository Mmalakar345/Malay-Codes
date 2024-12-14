package SortingAlgorithum;

import java.util.*;

public class InbuildSort {

    public static void inbuildSortAcendingOrder(int [] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void inbuildSortRangeAcending(int [] arrR){
        Arrays.sort(arrR,0,3);
        System.out.println(Arrays.toString(arrR));
    }
    
    public static void inbuildSortDecendingOrder(Integer [] arr1){
        Arrays.sort(arr1,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr1));
    }
    public static void inbuildSortRangeDecending(Integer [] arr2){
        Arrays.sort(arr2,1,4,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr2));
    }


    public static void main(String[] args) {
        int[] arr = {5,7,90,1,2,4,65};
        inbuildSortAcendingOrder(arr);

        int[] arrR = {5,7,9,1,2,42,6};
        inbuildSortRangeAcending(arrR);

        Integer[] arr1 = {5,71,9,11,2,4,6};
        inbuildSortDecendingOrder(arr1);

        Integer[] arr2 = {51,7,9,14,2,4,6};
        inbuildSortRangeDecending(arr2);

    }
    
}
