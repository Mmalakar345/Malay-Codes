// Write a java program to print the bellow pattern
package NestedLoop;
//11111
// 2222
//  333
//   44
//    5
import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j,row,k;
		System.out.print("Enter the row number = ");
		row = sc.nextInt();
	
		for(i=1;i<=row;i++) 
		{ 
			for(k=1;k<i;k++)  
				System.out.print(" ");
			for(j=1;j<=row+1-i;j++)
				System.out.print(i);
			System.out.println();	
		}
	}
}
