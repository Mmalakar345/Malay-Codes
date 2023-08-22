// Write a java program to count how many words have in a single sentence.
package String;
import java.util.Scanner;
public class CountWordsMultipleSen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = new String(); int i,count=1;
		System.out.println("Enter a sentence ");
		s = sc.nextLine();
		for(i=0;i<s.length()-1;i++) {
			/*char c,d;
			c = s.charAt(i);
			d = s.charAt(i+1);
			if((c==' ') && (d!=' '))*/
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
				count = count+1;
		}
		System.out.print(count+" Words present");
	}

}
