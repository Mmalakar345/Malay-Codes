// Write a java program to show a vector using size() function.
package Vector;
import java.util.*;
public class sizeFunction {
	
	public static void main(String[] args) {
		Vector<String> list = new Vector<String>(); // <String> set the defult string vector
		list.addElement("Ram");
		list.addElement("Shyam");
		list.addElement("Sita");
		System.out.println(list);

		System.out.println(list.size()); //this function count the list size
	}
}
