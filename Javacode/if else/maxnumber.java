//Write a program to find max between two numbers.

import java.util.Scanner;
class maxnumber
{
public static void main(String args[])
{
int a,b,c;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number :");
a=sc.nextInt();
System.out.println("Enter a number :");
b=sc.nextInt();
System.out.println("Enter a number :");
c=sc.nextInt();
if(a>b && a>c)
System.out.println("The max number is : "+a);
else if(b>a && b>c)
System.out.println("The max number is : "+b);
else
System.out.println("The max number is : "+c);

}  
}