// Write a java program to print the bellow pattern
package NestedLoop;
//12345
// 1234
//  123
//   12
//    1
import java.util.Scanner;

public class Pattern15 {

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
				System.out.print(j);
			System.out.println();	
		}
	}
}
