// Write a java proggram to find a number prime or not Using Class & Obj.
package ClassAndObj;
import java.util.Scanner;
public class PrimeNumber {
	
	int n;
	void getdata() { // input section.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number which you want to check ");
		n = sc.nextInt();
	}
	
	void putdata() { // Logic section
		int i,count=0;
		for(i=1;i<=n;i++){
			if (n%i==0)
				count=count+1;
		} // end for loop.
		if (count==2)
			System.out.println(n+" -- is a prime number");
		else		
			System.out.println(n+" -- is not a prime number");
	}

	public static void main(String[] args) { // main function
		PrimeNumber aa = new PrimeNumber();
		aa.getdata();
		aa.putdata();
	}//main function end
}//class end
