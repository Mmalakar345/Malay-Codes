// Write a java code to show how to find a elements on array using binary search.
package ArrayCodes;

public class BInarySearch {

    public static int BInarySearchNum(int numbers[], int key) {
        int start = 0, end = numbers.length-1;

        while (start <= end) {
            int mid = (start + end) / 2;
            // Comperisons
            if (numbers[mid] == key) {
                return mid; // found
            }

            if (numbers[mid] < key) { // right side
                start = mid + 1;
            } 
            else { // left side
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 5, 6, 7, 8, 10, 11 };
        int key = 100;

        System.out.println("The key found at index "+BInarySearchNum(numbers, key));
    }
}
