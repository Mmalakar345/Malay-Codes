//Write a java program to find sum of even digit & product of odd digit.
package While;

import java.util.Scanner;

public class evenOddSumProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,digit=0,evensum=0,oddpro=1;
		System.out.println("Enter A number Greter than of 9 = ");
		n = sc.nextInt();
		while (n>0)
		{
			digit=n%10;
			if (digit%2==0)
				evensum=evensum+digit;
			else
				oddpro=oddpro+digit;
			n=n/10;
			
		}
		System.out.println("The evensum is = "+evensum);
		System.out.println("The oddProduct is = "+oddpro);

	}

}
