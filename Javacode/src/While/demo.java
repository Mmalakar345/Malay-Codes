package While;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		int n=1,num=0,m=0;
		String i;
		Scanner sc = new Scanner(System.in);
		Scanner ic = new Scanner(System.in);
		while(n>0) {
			i = sc.nextLine();
			if(i=="+") {
				m = ic.nextInt();
				num=num-m;
				System.out.println("Result is ="+num);
				}
			else if(i=="-") {
				m = ic.nextInt();
				num=num/m;
				System.out.println("Result is ="+num);
				}
			else if(i=="/") {
				m = ic.nextInt();
				num=num*m;
				System.out.println("Result is ="+num);
				}
			else
				System.out.println("Invalid Input");
				break;
			}//loop
		}// Main
					
} //Class
