//Write a program to check a number even or odd.

import java.util.Scanner;
class evenodd
{
public static void main(String args[])
{
int a,b;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a positive number : ");
a = sc.nextInt();
System.out.println("Enter a positive number : ");
b = sc.nextInt();
if (a%2==0)
System.out.println("The even number is = "+a);
else
System.out.println("The odd number is = "+b);
}
}