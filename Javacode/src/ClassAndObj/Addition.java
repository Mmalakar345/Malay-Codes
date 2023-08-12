//Write a java program to print two diffirent number addition using Class & object.
package ClassAndObj;

import java.util.Scanner;
//sub class (add)
class add{ 
	int a,b;
	void getdata() { // using to input data
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value Of a");
		a = sc.nextInt();
		System.out.println("Enter the value Of b");
		b = sc.nextInt();
	}
	void putdata() { // using to addition logic and print value
		System.out.println("Addition is = "+(a+b));
	}
}
//main class (Addition)
public class Addition {  

	public static void main(String[] args) {
		add aa = new add();
		aa.getdata();
		aa.putdata();
	}
//multiple class when create program name and main function class name is same must.
}
// And when single class as usual use to . 



