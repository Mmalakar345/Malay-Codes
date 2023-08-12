// Write a java program to check and avoid Which numbers devided by 3,otherwise print.
package ClassAndObj;
import java.util.Scanner;
class Check1 {
	int n,i;
	void getdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Set the limit");
		n = sc.nextInt();
	}
	void putdata() {
		for(i=1;i<=n;i++)
		{
			if (i%3==0)
				continue;
			else
				System.out.println(i);	
		}
	}
}
public class Checking{

	public static void main(String[] args) {
		Check1 aa =new Check1();
		aa.getdata();
		aa.putdata();
	}
}

