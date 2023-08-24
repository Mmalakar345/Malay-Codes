// Write a java program to show a vector using removeAllElement(); function.
package Vector;
import java.util.*;
public class removeEleAllmentFunction {
	
	public static void main(String[] args) {
		Vector<String> list = new Vector<String>(); // <String> set the defult string vector
		list.addElement("Ram");
		list.addElement("Shyam");
		list.addElement("Sita");
		System.out.println(list);
		
		list.removeAllElements();
		System.out.println(list); //this function delete all elements
	}
}
