// Write a java program to find the factorial of a number.
package While;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,fact=1,store;
		System.out.println("Enter a number ");
		n=sc.nextInt();
		store=n;
		while (n>0) {
			fact=fact*n;
			n=n-1;
		}
		System.out.println(store+" Factorial is ==> "+fact);

	}

}
