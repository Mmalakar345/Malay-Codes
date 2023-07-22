//Write a java program to find even or odd number .
package ifelse;

import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in); // Scanner object create.
		System.out.println("Enter a positive number : ");
		a = sc.nextInt();
	// Logic part
		if (a%2==0)
		System.out.println(a+" = is a even number.");
		else
		System.out.println(a+" = is a odd number.");
	}
}
