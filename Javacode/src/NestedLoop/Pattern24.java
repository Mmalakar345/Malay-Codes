// Write a java program to print the bellow pattern.
package NestedLoop;
//111111111
// 2222222
//  33333
//   444
//    5
import java.util.Scanner;

public class Pattern24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j,n,b;
		System.out.println("Enter the Row number ");
		n = sc.nextInt();
		for (i=1;i<=n;i++) {
			for(b=1;b<=i;b++)
				System.out.print(" ");
			for(j=1;j<=2*(n-i)+1;j++)
				System.out.print(i);
			System.out.println();
		}// Loop close
	} // main functuon close
} //Class close

