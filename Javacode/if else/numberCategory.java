// Write a program to find a number is Positive /Negative /Zero.

import java.util.Scanner;
class numberCategory
{
public static void main(String args[])
{
int a;
Scanner sc = new Scanner(System.in);
System.out.println("Enter any number positive or negative :");
a= sc.nextInt();

if(a>0)
System.out.println("Positive Number");
else if(a<0)
System.out.println("Negative Number");
else
System.out.println("Zero Number");
}
}