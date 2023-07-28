//Write a java program to print the bellow pattern.
package NestedLoop;
//   1
//  123
// 12345
//1234567
// 12345
//  123
//   1
import java.util.Scanner;

public class Pattern27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j,n,b;
		System.out.println("Enter the row number ");
		n = sc.nextInt();
		//part one
		for (i=1;i<=n;i++) {
			for(b=1;b<=n-i;b++)
				System.out.print(" ");
			for(j=1;j<=2*i-1;j++)
				System.out.print(j);
			System.out.println();
		}
		//part two
		n=n-1;
		for (i=1;i<=n;i++) {
			for(b=1;b<=i;b++)
				System.out.print(" ");
			for(j=1;j<=2*(n-i)+1;j++)
				System.out.print(j);
			System.out.println();
		}
	} // Main function end
} // class end
