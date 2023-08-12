// write a java program to show parametarized contratctor how to use.
package OppS;
import java.util.Scanner;
public class ParametarizedCONS2 {
	int a,b,n;
	ParametarizedCONS2(int x,int y){ // Parametarized constractor.
		a=x;
		b=y;
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
		int m,n;
		Scanner sc = new Scanner(System.in);  // this prat use for the user defined value using.
		System.out.println("Enter a number");
		m= sc.nextInt();
		System.out.println("Enter a number");
		n= sc.nextInt();
		ParametarizedCONS2 aa = new ParametarizedCONS2(100,500); //object create 
		aa.display(); // at first print defult value 
		aa.output();
		ParametarizedCONS2 bb = new ParametarizedCONS2(m,n); //object create 
		bb.display(); // print user input value.
		bb.output();
	}

}// end class.
