// Write a java program to print the bellow pattern.
package NestedLoop;
//123456789
// 1234567
//  12345
//   123
//    1
import java.util.Scanner;

public class Pattern23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j,n,b;
		System.out.println("Enter the Row number ");
		n = sc.nextInt();
		for (i=1;i<=n;i++) {
			for(b=1;b<=i;b++)
				System.out.print(" ");
			for(j=1;j<=2*(n-i)+1;j++)
				System.out.print(j);
			System.out.println();
		}// Loop close
	} // main functuon close
} //Class close

