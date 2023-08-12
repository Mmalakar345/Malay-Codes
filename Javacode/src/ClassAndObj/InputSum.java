//Write a java program to input user required numbers and sum alla the numbers.
package ClassAndObj;
import java.util.Scanner;
class sumMethod{
	int i,n,sum=0,m=0;
	Scanner sc = new Scanner(System.in);
	void input(){
		System.out.println("How many number you want to sum");
		n = sc.nextInt();	
	}
	void putdata() {
		for(i=1;i<=n;i++) {
			System.out.println("Enter the number = ");
			m = sc.nextInt();
			sum=sum+m;
		}
	}
	void display() {
		System.out.println("Total sum is = "+sum);
	}
}

public class InputSum {

	public static void main(String[] args) {
		sumMethod aa = new sumMethod();
		aa.input();
		aa.putdata();
		aa.display();
	}
}
