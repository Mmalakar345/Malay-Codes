// Write a program to create simple calulator demo.

import java.util.Scanner;
class calculator
{
public static void main(String args[])
{
int a,b,ch;
Scanner sc = new Scanner (System.in);
System.out.println("Enter the first number : ");
a=sc.nextInt();
System.out.println("Enter the second number : ");
b=sc.nextInt();

System.out.println("Enter your choice -> \n 1-> Addition \n 2-> Subtraction \n 3-> Multiplication \n 4-> Division  : ");
ch=sc.nextInt();
if(ch==1)
System.out.println("Addition result is =: "+(a+b));
else if(ch==2)
System.out.println("Subtraction result is =: "+(a-b));
else if(ch==3)
System.out.println("Multiplication result is =: "+(a*b));
else if(ch==4)
System.out.println("Division result is =: "+(a/b));
else 
System.out.println("Invalid Choice");
}
}