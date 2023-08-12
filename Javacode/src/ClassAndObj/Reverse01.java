// Write a java program to print reverse of a number to show passing arguments using class & Object.
package ClassAndObj;
// Only passing arguments without using return value.
import java.util.Scanner;
//Sub Class revrs
class revrs{
int n;
void getdata(int i){
	n = i;
}
void putdata() {
	int rev=0,p;
	p=n; // copy the input number for future use.
	while(n>0) {
		rev=(rev*10)+(n%10);
		n=n/10;
	}
	System.out.print("The number "+p+" it's reverse is = "+rev);
  }
}// sub class end

// main class Reverse01.
public class Reverse01 {

	public static void main(String[] args) {
		revrs aa = new revrs();
		int m;
		Scanner sc = new Scanner(System.in);
		System.out.println("Eanter a number");
		m = sc.nextInt();
		aa.getdata(m);
		aa.putdata();
	}
}
