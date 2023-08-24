// Write a java program to show a vector using insertelementAt("item name",index) function.
package Vector;
import java.util.*;
public class insertelementAtFunction {
	
	public static void main(String[] args) {
		Vector<String> list = new Vector<String>(); // <String> set the defult string vector
		list.addElement("Ram");
		list.addElement("Shyam");
		list.addElement("Sita");
		System.out.println(list);
		
		list.insertElementAt("Laxman", 1); //item add on the index number .
		System.out.println(list);  // and vector size autometically increased.
	}
}
