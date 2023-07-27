// Write a java program to print the bellow pattern
package NestedLoop;
//55555
// 4444
//  333
//   22
//    1
import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j,row,k,b;
		System.out.print("Enter the row number = ");
		row = sc.nextInt();
	
		b=5;
		for(i=1;i<=row;i++) 
		{ 
			for(k=1;k<i;k++)  
				System.out.print(" ");
			for(j=1;j<=row+1-i;j++)
				System.out.print(b);
			b--;
			System.out.println();	
		}
	}
}
