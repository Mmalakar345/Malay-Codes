// Write a java program to show a vector using removeElement(index) function.
package Vector;
import java.util.*;
public class removeElementAtFunction {
	
	public static void main(String[] args) {
		Vector<String> list = new Vector<String>(); // <String> set the defult string vector
		list.addElement("Ram");
		list.addElement("Shyam");
		list.addElement("Sita");
		System.out.println(list);
		
		list.removeElementAt(1);
		System.out.println(list); //this function delete the parameter index item.
	}
}
