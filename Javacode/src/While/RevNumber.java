//Write a program to find a reverse of a number
package While;

import java.util.Scanner;

public class RevNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,rev=0;
		System.out.println("Enter A number Greter than of 9 = ");
		n = sc.nextInt();
		while (n>0)
		{
			rev = (rev*10) +(n%10);
			n=n/10;
			
		}
		System.out.println("The reverse number is = "+rev);

	}

}
