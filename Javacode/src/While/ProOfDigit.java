//Write a java program to find the product of the digit of n input.

package While;

import java.util.Scanner;
public class ProOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,pro=1;
		System.out.println("Enter a number ");
		n = sc.nextInt();
		while (n>0) {
			pro=pro*(n%10);
			n=n/10;
		}
		System.out.println("Product of the digit is = "+pro);

	}

}
