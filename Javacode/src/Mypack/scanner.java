// Write a java program and show how to input using Scanner function.(Addition two numbe).
package Mypack;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		int a,b,sum;
		Scanner sc = new Scanner(System.in); // Scanner object create.
		System.out.println("Enter the first number = ");
		a=sc.nextInt();
		System.out.println("Enter the second number :");
		b=sc.nextInt();
		sum=a+b;
		System.out.println("Add number : "+sum);
	}
}
