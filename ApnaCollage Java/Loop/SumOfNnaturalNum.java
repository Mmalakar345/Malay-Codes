// Write a java code to user defined numbers sum.

import java.util.Scanner;

public class SumOfNnaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many natural number you want to add ?? = ");
        int n = sc.nextInt();
        int num = 0;
        long Sum = 0;
        while (num <= n) {
            Sum = num + Sum;
            num++;
        }
        System.out.println("Sum is = "+Sum);
    }

}
