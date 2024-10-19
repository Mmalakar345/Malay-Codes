// write a java code to show sum of two digits using function call.


import java.util.Scanner;
public class SumCalculate {

    public static void sumnumber(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your First number ");
        int num1 = sc.nextInt();

        System.out.println("Enter your Second number ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum is = "+sum);
    }
    public static void main(String[] args) {
        sumnumber();
    }
}
