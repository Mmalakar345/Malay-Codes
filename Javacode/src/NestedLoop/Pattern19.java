// Write a java program to print the bellow pattern.
package NestedLoop;
//    *
//   ***
//  *****
// *******
//**********
import java.util.Scanner;
public class Pattern19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,i,j,b;
		System.out.println("Enter the row number ");
		n = sc.nextInt();
		
		for(i=1;i<=n;i++) {
			for(b=1;b<=n-i;b++)
				System.out.print(" ");
			for(j=1;j<=2*i-1;j++)
				System.out.print("*");
			System.out.println();	
		}
	}
}
