// Write a java program to show the break concepet in a program.
package Mypack;
//import java.util.Scanner;
public class BreakConcept {

	public static void main(String[] args) {
		//Scanner sc =new Scanner(System.in);
		int i;
		i=1;
		while (i<10) {
			System.out.println(i);
			i++;
			if (i==6)
				break;
		}
		System.out.println("Execution complete");
	}
}
