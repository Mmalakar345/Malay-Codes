// Write a java program to print fibonacci series with max value.

package While;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n,x=0,y=1,z=0;
		System.out.println("Enter The max value");
		n = sc.nextInt();
		while (z<=n)
		{
			 System.out.print(z+" ");
			 x=y;
			 y=z;
			 z=x+y;
		 }
	}
}



