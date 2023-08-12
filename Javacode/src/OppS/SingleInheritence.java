// Write a java program to show single inheritence by a addition program.
package OppS;
import java.util.Scanner;
class A{
	int a,b;
	void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
		a = sc.nextInt();
		System.out.println("Enter the value of b");
		b = sc.nextInt();	
	}
	void display() {
		System.out.println("a + b = "+(a+b));
	}
} // Class A end

class B extends A{
	int c;
	void getdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of c");
		c = sc.nextInt();
	}
	void addition() {
		System.out.println("a+b+c = "+(a+b+c));
	}	
} // Class B end

public class SingleInheritence {
	// in this topic when use inheritence method all time create the object on extends  class
	public static void main(String[] args) {
		 B aa = new B(); // so object create only class B
		 aa.input(); // for class A
		 aa.getdata(); // for class B
		 aa.display(); // for class A
		 aa.addition(); // for class B
	}
}
