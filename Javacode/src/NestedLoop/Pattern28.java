// Write a java program to print the bellow pattern.
package NestedLoop;
//   1
//  222
// 33333
//4444444
// 33333
//  222
//   1
import java.util.Scanner;

public class Pattern28 {

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
				System.out.print(i);
			System.out.println();
		}
		//part two
		n=n-1;
		for (i=1;i<=n;i++) {
			for(b=1;b<=i;b++)
				System.out.print(" ");
			for(j=1;j<=2*(n-i)+1;j++)
				System.out.print(n+1-i);
			System.out.println();
		}
	} // Main function end
} // class end
