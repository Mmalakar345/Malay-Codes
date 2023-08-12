//Write a java program to show Method Overriding.
package OppS;

class AA{
	void display() {   // base class method override just because of derived class present same function.
		System.out.println("Welcome to Base Class AA");
	}
}

class BB{
	void display() { // any obj atfirst find any function on there respected derived classes.
		System.out.println("Welcome to derived Class BB");
	}
}

public class MethodOverriding {
	// rule is that you can only derived class obj create.
	public static void main(String[] args) {
		BB aa = new BB();
		aa.display();
	}
}
