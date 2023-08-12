// write a java program to show parametarized contratctor how to use.
package OppS;
import java.util.Scanner;
public class ParametarizedCONS {
	int a,b,n;
	ParametarizedCONS(int x,int y){ // Parametarized constractor.
		a=x;
		b=y;
	}
	void inpit() { // this prat use for the user defined value using.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		a= sc.nextInt();
		System.out.println("Enter a number");
		b= sc.nextInt();
	}
	
	void display() {
		System.out.println("a= "+a+"\nb= "+b);
		//System.out.println(a+" "+b);
	}
	void output() {
		n=a+b;
		System.out.println("a+b= "+n);
	}

	public static void main(String[] args) {
		ParametarizedCONS aa = new ParametarizedCONS(11,22); //object create 
		aa.display();// at first print defult value
		aa.output();
		aa.inpit(); // when get input value then,
		aa.display(); // print user input value.
		aa.output();
	}

}// end class.
