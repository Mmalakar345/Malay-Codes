//Write a program and find the area & Perimeter of a Rectangle.
package Mypack;

import java.util.Scanner;

public class rectangle {

	public static void main(String[] args) {
		int len,br,area,peri;
		Scanner sc = new Scanner(System.in); // Scanner object create.
		System.out.println("Enter the value of Length :");
		len=sc.nextInt(); // Input value store.
		System.out.println("Enter the value of Length :");
		br=sc.nextInt(); // Input value store.
		area=len*br;
		peri=2*(len+br);
		System.out.println("Rectangle area is : "+area);
		System.out.print("Rectangle Perimeter is : "+peri);
	}
}
