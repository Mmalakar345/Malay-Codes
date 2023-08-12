// Write a java program to show Multilevel inheritence by a addition program.
package OppS;
import java.util.Scanner;
class M{
	int a;
	void inputa(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
		a = sc.nextInt();	
	}
} // Class A end

class N extends M{
	int b;
	void inputb(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of b");
		b = sc.nextInt();
	}
} // end class b
	
class O extends N{
	void getdata() {
		System.out.println("Addition is = "+(a+b));
	}
} // End class C

public class MultilevelInheritence {
	// in this topic when use inheritence method all time create the object on extends  class
	public static void main(String[] args) {
		O ss = new O(); // so object create only class O
		ss.inputa(); 	// For class M
		ss.inputb(); 	//For class N
		ss.getdata();	// For class O
	}
}
