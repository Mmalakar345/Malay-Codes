// Write a java program to show reverse word print.
package String;
import java.util.Scanner;
public class ReverseWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = new String();
		System.out.println("Enter a sentence");
		s = sc.nextLine();
		int i,j,k;
		i = s.length()-1;
		
		while(i>=0){
			j=i;
			while(s.charAt(j)!=' ' && j>0)
				j--;
			
			if(j==0)
				k=0;
			else
				k=j+1;
			System.out.print(s.substring(k,i+1)+" ");
			i=j-1;	
		}
		
	}
}