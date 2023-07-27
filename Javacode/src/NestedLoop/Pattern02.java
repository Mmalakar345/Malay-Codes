// Write a java program to print the bellow pattern.
package NestedLoop;
//1
//12
//123
//1234
//12345
import java.util.Scanner;

public class Pattern02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j,row;
		System.out.print("Enter the row number = ");
		row = sc.nextInt();
	
		for(i=1;i<=row;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
