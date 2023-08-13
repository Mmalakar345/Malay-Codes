//Write a java program to print sum of a user defined array.
package Array;
import java.util.Scanner;

class addsum {
    int i, sum, size;
    Scanner sc = new Scanner(System.in);
    int arr[]; // declear blank array

    void inputdata() {
        arr = new int[size]; // Create array size
        System.out.print("Enter the array size = ");
        size = sc.nextInt();
        
        for (i = 0; i < size; i++) {
            System.out.print("Enter a number = ");
            arr[i] = sc.nextInt();
        }
    }

    void display() {
        for (i = 0; i < size; i++) {
            sum = sum + arr[i];
        }
        System.out.print("Sum of array is = " + sum);
    }
}

public class SumOfArray2{
	public static void main() {
		addsum aa = new addsum();
		aa.inputdata();
		aa.display();
	}
}