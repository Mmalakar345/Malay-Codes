//Write a java program to print fibonacci series,how many term print according to Your choice.
package While;
import java.util.Scanner;

public class FibonacciSeriesTerms {
	
	public static void main(String[] args) {
	// Write a java program to print fibonacci series with max value.
		Scanner sc = new Scanner(System.in);
		int n,x=0,y=1,z=0,term=1;
		System.out.println("Enter how many term you wanted to print ");
		n = sc.nextInt();
		while (term<=n)
		{
			System.out.print(z+" ");
			x=y;
			y=z;
			z=x+y;
			term=term+1;
		}
	}
}
