// Write a java program to show final variable.
package OppS;

class demo{
	void display(){
		int a = 5;
		final int b = 10;
		a=25;
		// b=56; this value changing is not possible
		System .out.println("a= "+a+"\nb= "+b);
	}
}

public class FinalVariable {
	
	public static void main(String[] args) {
		demo aa = new demo();
		aa.display();
	}
}
