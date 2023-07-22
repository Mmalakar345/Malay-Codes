//Write a program to check whether a number is prime or not
package While;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,count=0,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n = sc.nextInt();
		i=1; //initialization 
		while (i<=n) {
			if (n%i==0)
				count=count+1;
			i=i+1;
		}
		if (count==2)
			System.out.println("This is a prime number");
		else
			System.out.println("This is not a prime number");
		

	}

}
