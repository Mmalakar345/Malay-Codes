// Write a java code to show Array function in a simple example.
package Array;
import java.util.Scanner;
class arr{
	int a[] = new int[10];
	void input(){
		Scanner sc = new Scanner(System.in);
		for(int i =0;i<=10;i++) {
			System.out.print("Enter a number = ");
			a[i] = sc.nextInt();
		}}
	void display() {
		for(int i=0;i<=10;i++) {
			System.out.print(" "+(a[i]));	
		}
	}
} //class arr end

public class DisplayArray {

	public static void main(String[] args) {
		arr ab = new arr();
		ab.input();
		ab.display();
	}
}//class DisplayArray end

