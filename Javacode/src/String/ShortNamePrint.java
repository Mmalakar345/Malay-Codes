// Write a java program to show short name ex(i/p=malay kumar malakar) (o/p= m.k.malakar.)
package String;
import java.util.Scanner;

public class ShortNamePrint {

	public static void main(String[] args) {
		String str1 = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		str1 = sc.nextLine();
		int i,j;
		char c,d;
		i = str1.length()-1;
		// this loop set the i value in last blank space
		while(str1.charAt(i)!=' ')
			i--;
		
		j = 0;
		while(j<i) {
			if(j==0) //print first name first word
				System.out.print(str1.charAt(j)+".");
			else{ 		// print middle name first word
				c = str1.charAt(j);
				d = str1.charAt(j+1);
				if(c==' ' && d!=' ' )
					System.out.print(d+".");		
			}
			j++;
		}
		
		System.out.print(str1.substring(j)+"."); // print last name
	}
}
