// Write a java program to show using compareTo function.
package String;
import java.util.Scanner;

public class CompareToFunction {

	public static void main(String[] args) {
		String str1 = new String();
		String str2 = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String");
		str1 = sc.nextLine();
		System.out.println("Enter the Second String");
		str2 = sc.nextLine();
		
		if(str1.compareTo(str2)==0) // for case sensitive
			System.out.println("String is  Equal");
		else if(str1.compareTo(str2)>0) // for case insensitive
			System.out.println("String 1 grater than String 2");
		else
			System.out.println("String 1 less than String 2");
	}
}
