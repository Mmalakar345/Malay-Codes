// Write a java program to print the bellow pattern.
package NestedLoop;
//1
//23
//456
//78910
import java.util.Scanner;

public class Pattern04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j,row,k;
		System.out.print("Enter the row number = ");
		row = sc.nextInt();
		
		k=0;
		for(i=1;i<=row;i++) { 
			for(j=1;j<=i;j++) {
				k++;
				System.out.print(k);
			}
			System.out.println();	
		}
	}
}
