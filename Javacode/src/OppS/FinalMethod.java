//Write a java program to show Final Method using.
package OppS;

class MM{
	final void display() {   //
		System.out.println("Welcome to Base Class ");
	}
}

class NN extends MM{
	//void display() { //we can't write the same name use because final method name use.
	void run() {
		System.out.println("Welcome to derived Class ");
	}
}
public class FinalMethod {

	public static void main(String[] args) {
		NN a = new NN();
		a.display();
	}
}

