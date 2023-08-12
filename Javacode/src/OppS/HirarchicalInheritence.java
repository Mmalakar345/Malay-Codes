// Write a java program to show Hirarchical inheritence by a addition program.
package OppS;
import java.util.Scanner;

class EE{
	int a,b;
	void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
		a = sc.nextInt();
		System.out.println("Enter the value of b");
		b = sc.nextInt();	
	}
} // Class E end

class F extends EE{
	void addition() {
		System.out.println("Addition = "+(a+b));
	}	
} // Class F end

class G extends EE{
	void subtraction() {
		System.out.println("Subtraction is = "+(a-b));
	}	
} // Class G end

public class HirarchicalInheritence {
	// in this topic when use inheritence method all time create the object on extends class
	public static void main(String[] args) {
		F ff = new F();	// so object create only class F
		G gg = new G();	// so object create only class G
		ff.input();			//For class F
		ff.addition();		//For class F
		gg.input();			//For class G
		gg.subtraction();	//For class G
	}
}
