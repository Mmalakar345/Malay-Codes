//Write a java program to show Final Method using.
package OppS;

final class d{
	final void display() {   //
		System.out.println("Base Class ");
	}
}

class e {//extends d{  //we can't use the class "d" because final class use.
	void run() {
		System.out.println("derived Class ");
	}
}
public class FinalClass {

	public static void main(String[] args) {
		e a = new e();
		a.run();
	}
}

