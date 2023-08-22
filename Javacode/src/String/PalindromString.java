// Write a java program to check whether a string is Palindrom or not.
package String;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		String s = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to check ");
		s = sc.nextLine();
		int i,j,flag;
		i = 0;           // first index
		j = s.length()-1; // Last index
		flag = 0;
		while(i<j && flag==0) {
			if(s.charAt(i)!=s.charAt(j)) // first word or last word same or not
				flag = 1;
			i++;
			j--;
		}
		
		if (flag==0) 
			System.out.print("It is a Palindromic String");
		else
			System.out.print("It is not a Palindromic String");
	}
}
