// Write a java program to show the continue concepet in a program.
package Mypack;
import java.util.Scanner;
public class ContinueConcept {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		//System.out.println("Enter a number ");
		//i = sc.nextInt();
		i=1;
		while (i<=10) {
			i++;
			if (i==5) 
				continue; // when continue work 5 number was not print
			System.out.println(i);
		}
		System.out.println("Program Execution Complete");				

	}
}
