// Write a java program to find number of digits.
package For;
import java.util.Scanner;
public class NumberOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,count=0,s=1;
		System.out.println("Enter a number");
		n = sc.nextInt();
		for (s=1;n>0;s++)
		{
			count++;
			n=n/10;
		}
		System.out.println(count);
	}

}
