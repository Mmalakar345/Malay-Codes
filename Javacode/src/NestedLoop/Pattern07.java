// Write a java program to print the bellow pattern.
package NestedLoop;
//55555
//4444
//333
//22
//1
import java.util.Scanner;

public class Pattern07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j,row;
		System.out.print("Enter the row number = ");
		row = sc.nextInt();
		
		for(i=row;i>=1;i--) { 
			for(j=1;j<=i;j++) { 
				System.out.print(i);
			}
			System.out.println();	
		}
	}
}
