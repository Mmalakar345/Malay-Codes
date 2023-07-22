// Write a java program to print table of given number.
package For;
import java.util.Scanner;
public class Numbertable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j;
		System.out.println("Enter the table number Which you want to find");
		i= sc.nextInt();
		for (j=1;j<=10;j++) {
			System.out.println(i+" * "+j+" = "+j*i);
		}
	}
}
