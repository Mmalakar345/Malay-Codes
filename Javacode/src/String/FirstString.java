// Write a java program to show how to input a string .
package String;
import java.util.Scanner;
public class FirstString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = new String();
		String deg = new String();
		System.out.println("Enter your name ");
		name = sc.nextLine(); // nextLine use for multiple string(I am malay malakar).
		System.out.println("Enter your Recent Study Course name ");
		deg = sc.next(); // next use for single string (Malay).
		System.out.println("My Name is "+name+".");	
		System.out.println("I am studying now "+deg+" Course.");	
	}
}
