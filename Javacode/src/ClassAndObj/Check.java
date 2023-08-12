// Write a java program to check Which numbers devided by 5 and 7 both only.Find with a user defined check.
package ClassAndObj;
import java.util.Scanner;
class Check {
	int n,i;
	void getdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Set the limit");
		n = sc.nextInt();
	}
	
	void putdata() {
		for(i=1;i<=n;i++)
			
		{
			if ((i%5==0) & (i%7==0))
				System.out.println("** "+i+" **");	
		}
	}

	public static void main(String[] args) {
		Check aa =new Check();
		aa.getdata();
		aa.putdata();
	}
}

