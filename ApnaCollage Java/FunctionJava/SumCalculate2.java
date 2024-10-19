// write a java code to show sum of two digits using pass parameter or return statements.

import java.util.Scanner;
public class SumCalculate2 {
    public static int sumnumber(int num1, int num2){ // parameters or formal parameters 

        int sum = num1 + num2;
        return sum; // value return
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your First number ");
        int num1 = sc.nextInt();

        System.out.println("Enter your Second number ");
        int num2 = sc.nextInt();

        int sum = sumnumber(num1, num2); // arguments
        System.out.println("Sum is = "+sum);
    }
}
