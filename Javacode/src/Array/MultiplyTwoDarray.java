// Write a java program to show a 2 dimentional array in matrix formet.
package Array;
import java.util.Scanner;

class Multliply{
	Scanner sc =new Scanner(System.in);
	int a[][]; // create an array
	int b[][]; // create an array
	int c[][]; // create an array
	int i,j,size,k;
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
				c[i][j]=0;
				for(k=0;k<size;k++) 
					c[i][j]=c[i][j] + a[i][k] * b[k][j];		
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

public class MultiplyTwoDarray{
	public static void main(String args []) {
		Multliply aa = new Multliply();
		aa.array();
		aa.getdata();
		aa.putdata();
		aa.display();

	}
}
