// Write a java program to show a vector using addElement(item) function to user input by a loop.
package Vector;
import java.util.*;
public class addelementFunction2 {

	public static void main(String[] args) {
		Vector<String> list = new Vector<String>(); // <String> set the defult string vector
		String str = new String();
		Scanner sc = new Scanner(System.in);
		int i,size;
		System.out.println("How many Elements you want to add");
		size = sc.nextInt();
		
		for(i=0;i<size;i++) {
			System.out.println("Enter a string = ");
			str = sc.next();
			list.addElement(str); // add string at the list
		}
		System.out.print(list);
	}
} 
