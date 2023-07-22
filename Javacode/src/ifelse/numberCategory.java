// Write a java to to find negative ,positive and zero number.
package ifelse;

import java.util.Scanner;

public class numberCategory {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in); // Scanner object create.
		System.out.println("Enter any number positive or negative :");
		a= sc.nextInt(); //input value store

		if(a>0) //logic section 
		System.out.println("Positive Number");
		else if(a<0)
		System.out.println("Negative Number");
		else
		System.out.println("Zero Number");
	}
}
