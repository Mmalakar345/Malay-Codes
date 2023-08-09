// Write a java program to show some value print using defult constructor.
package OppS;

public class DefultConstructor {
	int a; String b;
	DefultConstructor(){ // Defult Constructor
		a = 01 ; b = "Malay Malakar";
	}
	
	void display() {
		System.out.println(a+" "+b);
	}

	public static void main(String[] args) {
		DefultConstructor aa = new DefultConstructor(); //object create 
		aa.display();	

	}
} // class end
