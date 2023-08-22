// Write a java program to count Vowel & Consonent in a sentence .
package String;
import java.util.Scanner;
public class CheckVowelConso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = new String(); // string obj create
		System.out.println("Enter a sentence ");
		n = sc.nextLine(); // nextLine use for multiple string(I am malay malakar).
		n=n.toUpperCase(); // convert to upper case
		int i,vol=0,con=0;
		for(i=0;i<n.length();i++) {  //n.length  count character.
			char c = n.charAt(i); // character obj create.
			if(c!=' ') {
				if(c=='A' || c=='E' ||c=='I' || c=='O' || c=='U')
					vol = vol+1;
				else
					con = con+1;
			}
		}
		System.out.println("Vowel present is the Sectence = "+vol);
		System.out.println("Consonent present is the Sectence = "+con);
	}
}
