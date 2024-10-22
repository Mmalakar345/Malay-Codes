// write a java code to show an array's largest value and smallest value.
package ArrayCodes;

public class LargestInArray {

    public static int FindlargestNum(int numbers[]) {
        int largest = Integer.MIN_VALUE;   // stote minimum value in integer
        int smallest = Integer.MAX_VALUE; // stote maximum value in integer

        for (int i = 0; i < numbers.length; i++) {
            //Finding Largest value and update
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            //Finding Smallest value and update
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.err.println("Smallest value is = "+smallest);
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 5, 9, 11, 2, 8 };

        System.out.println("Largest value is = "+FindlargestNum(numbers));
    }
}
