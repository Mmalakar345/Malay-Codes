// Write a java program to input few numbers and then find the max number
package ifelse;

import java.util.Scanner;

public class maxnumber {

	public static void main(String[] args) {
		int a,b,c; //Variable inisialization.
		Scanner sc = new Scanner(System.in); // Scanner object create.
		System.out.println("Enter a number :");
		a=sc.nextInt();
		System.out.println("Enter a number :");
		b=sc.nextInt();
		System.out.println("Enter a number :");
		c=sc.nextInt();
		if(a>b && a>c) // logic section
		System.out.println("The max number is : "+a);
		else if(b>a && b>c)
		System.out.println("The max number is : "+b);
		else
		System.out.println("The max number is : "+c);
	}
}
