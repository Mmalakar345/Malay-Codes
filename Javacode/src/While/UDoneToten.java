package While;

import java.util.Scanner;

public class UDoneToten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,run;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many number you want to print :");
		run = sc.nextInt();
		
		i=1;
		while (i<=run)
		{
		System.out.println(i);
		i=i+1;
		}
	}
}
