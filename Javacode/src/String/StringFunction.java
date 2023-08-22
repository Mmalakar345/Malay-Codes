// Write a java program to show using 1. equal and 2. equalIgnoreCase this functions.
package String;
import java.util.Scanner;

public class StringFunction {

	public static void main(String[] args) {
		String str1 = new String();
		String str2 = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String");
		str1 = sc.nextLine();
		System.out.println("Enter the Second String");
		str2 = sc.nextLine();
		
		if(str1.equals(str2)) // for case sensitive
			System.out.println("String is case sensitive or Equal");
		else if(str1.equalsIgnoreCase(str2)) // for case insensitive
			System.out.println("String is case insensitive or Equal");
		else
			System.out.println("String is not Equal");
	}
}
