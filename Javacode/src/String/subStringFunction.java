// Write a java program to show using 1. substring(n) and 2. substring(n,m) this functions.
package String;
//import java.util.Scanner;

public class subStringFunction {

	public static void main(String[] args) {
		String str1 = new String();
		String str2 = new String();
		//Scanner sc = new Scanner(System.in);
		
		//System.out.println("Enter a string in upper case ");
		//str1 = sc.nextLine();
		str1 = "Malakar";
		System.out.println("str1.substring(2) = "+str1.substring(2));
		
		//System.out.println("Enter a String in lower case");
		//str2 = sc.nextLine();
		str2 = "Malakar";
		System.out.println("str2.substring(2,4) = "+str2.substring(2,4));
	}
}
