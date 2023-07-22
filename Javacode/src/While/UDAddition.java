package While;

import java.util.Scanner;

public class UDAddition  {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int i,n,add;
			System.out.println("Enter the Start number = ");
			i=sc.nextInt();
			System.out.println("Enter the last number = ");
			n=sc.nextInt();
			add=0;
			while (i<=n)
			{
				add=add+i;
				i=i+1;
			}
			System.out.println("Addition result = "+add);
						
		}
}
