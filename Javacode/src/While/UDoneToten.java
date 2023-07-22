// Write a user defined java program to print one to ten numbers.
package While;

import java.util.Scanner;

public class UDoneToten {

	public static void main(String[] args) {
		int i,run;
		Scanner sc = new Scanner(System.in); // Scanner object create
		System.out.println("How many number you want to print :");
		run = sc.nextInt();
		// Logic nsection
		i=1;
		while (i<=run)
		{
		System.out.println(i);
		i=i+1;
		}
	}
}
