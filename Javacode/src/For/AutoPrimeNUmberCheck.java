//Write a java program to find auto checking prime number with a range.
package For;
import java.util.Scanner;
public class AutoPrimeNUmberCheck {

	public static void main(String[] Malay) {
		Scanner sc = new Scanner(System.in); //Input object create.
		int i,j,count,limit,total=0;
		System.out.println("Enter the limit of prime number checking");
		limit = sc.nextInt(); //Input value store.
		for(i=1;i<=limit;i++) // Logic part
		{
			count=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
					count=count+1;	
			}// for loop 2
			if (count==2) 
			{
				//System.out.println(i+" Is a prime number");
				total++;
			}
		}// for loop 1
		System.out.println("1 to "+limit+" Total prime number is --> "+total);	
	}// main function
}// main class
