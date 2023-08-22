// Write a java program to show 
package String;

import java.util.Scanner;

public class Buffer {
	public static void main(String[] args) {
		StringBuffer str=new StringBuffer();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your String: ");
		//str = (sc.nextLine()); is not working in StringBuffer
		str.append(sc.nextLine()); // this is the input method
		str.setCharAt(3,'u');
		System.out.println(str);
		str.insert(3,"ABCD");
		str.setLength(20); //set output length index wise
		System.out.println(str);	
		str.setLength(3);  //set output length index wise
		System.out.println(str);	
	}
}

