// Write a java program and show how to input using Scanner function.
package Mypack;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		int a,b,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number = ");
		a=sc.nextInt();
		System.out.println("Enter the second number :");
		b=sc.nextInt();
		sum=a+b;
		System.out.println("Add number : "+sum);
	}
}
