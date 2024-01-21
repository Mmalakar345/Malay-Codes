// Write a java program to show Sum of the digit
import java.util.Scanner;

public class SumofDigit{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your First number = ");
        int num1 = sc.nextInt();
        System.out.print("Enter Your Second number = ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum Of The Digits = "+sum);
        sc.close();
    }
}