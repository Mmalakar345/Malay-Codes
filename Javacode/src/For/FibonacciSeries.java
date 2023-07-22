//Write a java program to print fibonacci series, how many term print according to Your choice.
package For;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //scanner object create
		int n,x=0,y=1,z=0,run;
		System.out.println("Enter how many term you wanted to print");
		n = sc.nextInt(); // Input value store.
		for(run=1;run<=n;run++) //Logic part.
		{
			 System.out.print(z+" ");
			 x=y;
			 y=z;
			 z=x+y;
		 }
	}
}
