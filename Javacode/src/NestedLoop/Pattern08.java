// Write a java program to print the bellow pattern.
package NestedLoop;
//12345
//6789
//101112
//1314
//15
import java.util.Scanner;

public class Pattern08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j,row,k;
		System.out.print("Enter the row number = ");
		row = sc.nextInt();
		
		k=0;
		for(i=row;i>=1;i--) { 
			for(j=1;j<=i;j++) {
				k++;
				System.out.print(k);
			}
			System.out.println();	
		}
	}
}
