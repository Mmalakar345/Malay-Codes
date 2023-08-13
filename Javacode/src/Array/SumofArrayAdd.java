//Write a java program to print sum of a user defined array.
package Array;

import java.util.Scanner;

public class SumofArrayAdd {

	public static void main(String[] args) {
		int i=0,sum=0,size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size = ");
		size = sc.nextInt();
		int arr[] = new int[size]; // Create an array
			
		for(i=0;i<size;i++) {
			System.out.print("Enter a number = ");
			arr[i] = sc.nextInt();
			}

		for(i=0;i<size;i++) 
			sum=sum+arr[i];
			
		System.out.print("Sum of array is = "+sum);
	}

}
