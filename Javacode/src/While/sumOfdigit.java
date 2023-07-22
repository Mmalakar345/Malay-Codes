// Write a java program to inpput a number and find sum of each digit of the number.
package While;

import java.util.Scanner;

public class sumOfdigit {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in); // Scanner object create
			int n,add=0,sum=0;
			System.out.println("Enter A number Greter than of 9 = ");
			n = sc.nextInt();
			// Logic of the program
			while (n>0)
			{
				//sum=sum+n%10; //alternative way off add and sum line
				add = n%10;
				sum=sum+add;
				n=n/10;	
			}
			System.out.println("The sum of all number is = "+sum);
	}
}
