//Write aa java program to findto number sum using BufferedReader.
package Mypack;

import java.io.*;

public class BufferReader {

	public static void main(String args[])throws IOException 
	{
		int a,b,sum;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the first number = ");
		a=Integer.parseInt(br.readLine());
		System.out.println("Enter the second number :");
		b=Integer.parseInt(br.readLine());
		sum=a+b;
		System.out.println("Add number : "+sum);
	}
}
