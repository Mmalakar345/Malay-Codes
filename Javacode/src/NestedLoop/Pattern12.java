// Write a java program to print the bellow pattern.
package NestedLoop;
//    1
//   22
//  333
// 4444
//55555
import java.util.Scanner;
public class Pattern12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j,row,k;
		System.out.print("Enter the row number = ");
		row = sc.nextInt();

		for(i=1;i<=row;i++) {
			for(k=1;k<=row-i;k++)
				System.out.print(" ");
			for(j=1;j<=i;j++)
				System.out.print(i);
			System.out.println();	
		}
	}
}
