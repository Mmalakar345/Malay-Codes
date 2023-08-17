// Write a java program to show a 2 dimentional array in matrix formet.
package Array;
import java.util.Scanner;

class TwoD{
	Scanner sc =new Scanner(System.in);
	int a[][];
	int i,j,size;
	void array() {
		System.out.println("Enter the array size");
		size = sc.nextInt();
		a = new int[size][size];
	}
	
	void getdata() {
		for(i=0;i<size;i++)
			for(j=0;j<size;j++) {
				System.out.print("Enter a number = ");
				a[i][j] = sc.nextInt();			
			}
	}
	
	void putdata() {
		for(i=0;i<size;i++) {
			for(j=0;j<size;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}

public class TwoDarray{
	public static void main(String args []) {
		TwoD aa = new TwoD();
		aa.array();
		aa.getdata();
		aa.putdata();
		
	}
}
