// Write a java program to show a vector using removeElement("item"); function.
package Vector;
import java.util.*;
public class removeElementFunction {
	
	public static void main(String[] args) {
		Vector<String> list = new Vector<String>(); // <String> set the defult string vector
		list.addElement("Satyabhama");
		list.addElement("Sunu");
		list.addElement("Riya");
		list.addElement("Ravi");
		System.out.println(list);
		
		list.removeElement("Ravi");
		System.out.println(list); //this function delete the parameter item
	}
}
