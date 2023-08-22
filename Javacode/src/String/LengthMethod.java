// Write a java program to show length method use at string .
package String;
import java.util.Scanner;
public class LengthMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = new String();
		System.out.println("Enter your name ");
		n = sc.nextLine(); // nextLine use for multiple string(I am malay malakar).
		// print length of the string type 1
		System.out.println("Length of the string = "+n.length());
		// print length of the string type 2
		int len = n.length();
		System.out.println("Length of the string = "+len);
	}
}
