// Write a java program to show using indexOf('a',3)  functions.
package String;
import java.util.Scanner;

public class IndexOfFunction {

	public static void main(String[] args) {
		String str1 = new String();
		String str2 = new String();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string ");
		str1 = sc.nextLine();
		System.out.println("str1.indexOf('a') = "+str1.indexOf('a'));
		
		System.out.println("Enter a string ");
		str2 = sc.nextLine();
		System.out.println("str1.indexOf('a',2) = "+str2.indexOf('a',2));	
	}
}
