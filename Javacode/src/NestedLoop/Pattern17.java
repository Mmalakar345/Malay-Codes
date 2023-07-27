// Write a java program to print the bellow pattern
package NestedLoop;
//12345
// 6789
//  101112
//   1314
//    15
import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j,row,k,b;
		System.out.print("Enter the row number = ");
		row = sc.nextInt();
	
		b=1;
		for(i=1;i<=row;i++) 
		{ 
			for(k=1;k<i;k++)  
				System.out.print(" ");
			for(j=1;j<=row+1-i;j++)
				System.out.print(b+1);
				
			System.out.println();	
		}	
	}
}
