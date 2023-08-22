// Write a java program to show using case converting functions.
package String;
import java.util.Scanner;

public class CaseConvertFunction {

	public static void main(String[] args) {
		String str1 = new String();
		String str2 = new String();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string in upper case ");
		str1 = sc.nextLine();
		System.out.println(str1.toLowerCase());
		
		System.out.println("Enter a String in lower case");
		str2 = sc.nextLine();
		System.out.println(str2.toUpperCase());
	}
}
