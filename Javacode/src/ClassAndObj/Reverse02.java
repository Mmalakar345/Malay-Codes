// Write a java program to print reverse of a number to show passing arguments using class & Object.
package ClassAndObj;
// passing arguments with using return value.
import java.util.Scanner;
//Sub Class revrs
class demo{
int n;
void getdata(int i){
	n = i;
}
int putdata() {
	int rev=0,p;
	p=n; // copy the input number for future use.
	while(n>0) 
	{
		rev=(rev*10)+(n%10);
		n=n/10;
	}
	return(rev);
  }
}// sub class end

// main class Revers.
public class Reverse02 {

	public static void main(String[] args) {
		demo aa = new demo();
		int m,val;
		Scanner sc = new Scanner(System.in);
		System.out.println("Eanter a number");
		m = sc.nextInt();
		aa.getdata(m);
		val=aa.putdata(); // return value come to this point.
		System.out.print("The number "+m+" it's reverse is = "+val);
	}
}
