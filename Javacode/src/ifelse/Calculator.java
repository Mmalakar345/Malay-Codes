// Write a java program to print a menu based input function addition,subtraction,multiplication & Dividion of two number.
package ifelse;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int a,b,ch;
		Scanner sc = new Scanner (System.in); //  Sccanner obbject create
		System.out.println("Enter the first number : ");
		a=sc.nextInt();
		System.out.println("Enter the second number : ");
		b=sc.nextInt();
// menu create 
		System.out.println("Enter your choice -> \n 1-> Addition \n 2-> Subtraction \n 3-> Multiplication \n 4-> Division  : ");
		ch=sc.nextInt(); //input value store
		if(ch==1)
		System.out.println("Addition result is =: "+(a+b));
		else if(ch==2)
		System.out.println("Subtraction result is =: "+(a-b));
		else if(ch==3)
		System.out.println("Multiplication result is =: "+(a*b));
		else if(ch==4)
		System.out.println("Division result is =: "+(a/b));
		else 
		System.out.println("Invalid Choice");
	}
}
