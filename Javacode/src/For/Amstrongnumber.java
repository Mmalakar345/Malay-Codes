// Write a java program to find a number Amstrong or not.
package For;

import java.util.Scanner;

public class Amstrongnumber {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n,z,count=0,s,digit,i,pro=1,sum=0;
			System.out.println("Enter a number");
			n = sc.nextInt();
			//count number of digit
			z=n;
			s=1;
			for (s=1;z>0;s++)
			{
				count++;
				z=z/10;
			}
			z=n;
			while (z>0)
			{	//digit exteaction
				digit=z%10;
				pro=1;
				for(i=1;i<=count;i++) //count time multiplecation.
					pro=pro*digit;
				sum=sum+pro;
				z=z/10;
			}
			if (sum==n)
				System.out.println(n+" is a Amstrong number");
			else
				System.out.println(n+" is not a Amstrong number");
		}

	}

}
