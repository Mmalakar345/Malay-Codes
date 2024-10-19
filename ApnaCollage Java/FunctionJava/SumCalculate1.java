// write a java code to show sum of two digits using pass parameter.

import java.util.Scanner;
public class SumCalculate1 {
    public static void sumnumber(int num1, int num2){ // formal parameter
        

        int sum = num1 + num2;
        System.out.println("Sum is = "+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your First number ");
        int num1 = sc.nextInt();

        System.out.println("Enter your Second number ");
        int num2 = sc.nextInt();
        sumnumber(num1, num2); // arguments
    }
}
