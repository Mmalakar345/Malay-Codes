// Write a java program to show some value print using defult constructor.
package OppS;

public class DefultConstructor2 {
	int a,m,n; String b;
	
	DefultConstructor2(){ // defult constractor.
		a=12;
		b="Malay";
		m=10;
	}
	
	void display() {
		System.out.println("a= "+a+"\nb= "+b+"\nm= "+m);
	}
	void output() {
		n=a+m;
		System.out.println("a+m= "+n);
	}

	public static void main(String[] args) {
		DefultConstructor2 aa = new DefultConstructor2(); //object create 
		aa.display();
		aa.output();
	}
} // class end
