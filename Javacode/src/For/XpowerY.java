package For;
import java.util.Scanner;
public class XpowerY {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y,power=1,run=1;
		System.out.print("Enter x value = ");
		x = sc.nextInt();
		System.out.print("Enter y value = ");
		y = sc.nextInt();
		
		for (run=1;run<=y;run++)
			power = power*x;
		
		System.out.print("X To the power of y is == "+power);
			

	}

}
