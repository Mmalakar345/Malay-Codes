// Write a java program to print the bellow pattern.
package NestedLoop;
//11111
//2222
//333
//44
//5
import java.util.Scanner;

public class Pattern09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j,row,k;
		System.out.print("Enter the row number = ");
		row = sc.nextInt();
		
		k=0;
		for(i=row;i>=1;i--) { 
			k++;
			for(j=1;j<=i;j++) {
				System.out.print(k);
			}
			System.out.println();	
		}
	}
}
