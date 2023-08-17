//Write a java program to find sum of each row and sum of each column.
package Array;
import java.util.Scanner;
class Transpose{
	int i,j,size;
	int ary[][];
	int bry[][];
	Scanner sc = new Scanner(System.in);
	
	void input(){
		System.out.println("Enter the array size ");
		size = sc.nextInt();
		ary = new int[size][size];
		bry = new int[size][size];
	}
	
	void getdata() {
		for(i=0;i<size;i++)
			for(j=0;j<size;j++) {
				System.out.print("Enter a number = ");
				ary[i][j] = sc.nextInt();
			}
	}
	
	void putdata(){
		for (i=0;i<size;i++) {
			for(j=0;j<size;j++) {
				System.out.print(ary[i][j]+" ");
				}
			System.out.println();
		}	
	}
	// Transpose type one
	void trans1(){
		for (i=0;i<size;i++) {
			for(j=0;j<size;j++) {
				System.out.print(ary[j][i]+" ");
				}
			System.out.println();
		}	
	}
	
	// Transpose type Two
	void trans2() {
		for(i=0;i<size;i++) 
			for(j=0;j<size;j++) {
				bry[i][j] = ary[j][i];
			}
		for(i=0;i<size;i++) {
			for(j=0;j<size;j++) {
				System.out.print(bry[i][j]+" ");
			}
			System.out.println();
		}
	}
	// Transpose type three
	void trans3(){
		int k=0;
		for (i=0;i<size;i++) {
			for(j=0;j<size;j++) {
				if(j>i) {
					k = ary[i][j];
					ary[i][j] = ary[j][i];
					ary[j][i] = k;
					}
				}		
			}
		//System.out.println("The Transpose Matrix is");
		for (i=0;i<size;i++) {
			for(j=0;j<size;j++) {
				System.out.print(ary[i][j]+" ");
				}
			System.out.println();
		}
		
	}
	
}

public class TransposeMatrix {

	public static void main(String[] args) {
		Transpose aa = new Transpose();
		aa.input();
		aa.getdata();
		System.out.println("The Orjinal Matrix");
		aa.putdata();
		//System.out.println("The Transpose Matrix");
		//aa.trans1();
		//System.out.println("The Transpose Matrix");
		//aa.trans2();
		System.out.println("The Transpose Matrix");
		aa.trans3();

	}
}
