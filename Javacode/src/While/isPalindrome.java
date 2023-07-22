/// Write a Program to check whether a number is Palindromic or not.

package While;

import java.util.Scanner;

public class isPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,rev,num;
		System.out.println("Enter A number ");
		n = sc.nextInt();
		num=n;
		rev=0;
		while (n>0) {
			rev=(rev*10)+(n%10);
			n=n/10;	
		}
		if (num==rev)
			System.out.println("It is a Palindromic number");
		else
			System.out.println("It is not a Palindromic number");
		



	}

}
