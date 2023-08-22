// Write a java program to show using concat this functions.
package String;
import java.util.Scanner;

public class concatFunction {

	public static void main(String[] args) {
		String str1 = new String();
		String str2 = new String();
		String str3 = new String();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string ");
		str1 = sc.nextLine();
		
		System.out.println("Enter a String ");
		str2 = sc.nextLine();
		
		str3=str1.concat(str2);
		System.out.print("New string is = "+str3);
	}
}
