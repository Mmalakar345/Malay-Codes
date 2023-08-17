// Write a java program to show a 2 dimentional array in matrix formet.
package Array;
import java.util.Scanner;

class sum2D{
	Scanner sc =new Scanner(System.in);
	int a[][]; // create an array
	int b[][]; // create an array
	int c[][]; // create an array
	int i,j,size;
	void array() {
		System.out.println("Enter the array size");
		size = sc.nextInt();
		a = new int[size][size]; //  an array size decleare
		b = new int[size][size]; //  an array size decleare
		c = new int[size][size]; //  an array size decleare
	}
	
	void getdata() {
		for(i=0;i<size;i++)
			for(j=0;j<size;j++) {
				System.out.print("Enter first matrix num = ");
				a[i][j] = sc.nextInt();			
			}
		
		System.out.println();
		
		for(i=0;i<size;i++)
			for(j=0;j<size;j++) {
				System.out.print("Enter Second matrix number = ");
				b[i][j] = sc.nextInt();			
			}
	}
	
	void putdata(){
		for(i=0;i<size;i++)
			for(j=0;j<size;j++) {
				c[i][j]=a[i][j] + b[i][j];		
			}
		
	}
	
	void display() {
		for(i=0;i<size;i++) {
			for(j=0;j<size;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}

public class SumTwoDarray{
	public static void main(String args []) {
		sum2D aa = new sum2D();
		aa.array();
		aa.getdata();
		aa.putdata();
		aa.display();

	}
}
