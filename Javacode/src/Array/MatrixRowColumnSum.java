//Write a java program to find sum of each row and sum of each column.
package Array;
import java.util.Scanner;
class RowColumn{
	int i,j,size;
	int ary[][];
	Scanner sc = new Scanner(System.in);
	
	void input(){
		System.out.println("Enter the array size ");
		size = sc.nextInt();
		ary = new int[size][size];
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
	
	void rowsum() {
		int sum;
		for(i=0;i<size;i++) {
			sum = 0;
			for(j=0;j<size;j++) {
				sum = sum+ary[i][j];
			}
			System.out.println("Sum of "+(i+1)+" row "+sum);
		}
	}
	
	void columnsum() {
		int sum;
		for(i=0;i<size;i++) {
			sum = 0;
			for(j=0;j<size;j++) {
				sum = sum+ary[j][i];
			}
			System.out.println("Sum of "+(i+1)+" Column "+sum);
		}
	}
}

public class MatrixRowColumnSum {

	public static void main(String[] args) {
		RowColumn aa = new RowColumn();
		aa.input();
		aa.getdata();
		aa.putdata();
		aa.rowsum();
		aa.columnsum();
	}
}
