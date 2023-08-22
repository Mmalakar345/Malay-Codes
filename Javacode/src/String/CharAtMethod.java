// Write a java program to show charAt method use at string .
package String;
import java.util.Scanner;
public class CharAtMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = new String();
		System.out.println("Enter your name ");
		n = sc.nextLine(); // nextLine use for multiple string(I am malay malakar).
		// print length of the string type 1
		System.out.println("Character at the index 1 = "+n.charAt(1));
		// print length of the string type 2
		int len = n.length();int i;
		for(i=0;i<len;i++) {
			System.out.println("Character is = "+n.charAt(i));
		}
	}
}
