// Write a java code to user defined number print 1 to n number.

import java.util.Scanner;

public class numberRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many number you want to print ?? = ");
        int n = sc.nextInt();
        int num = 1;
        while (num <= n) {
            System.out.println(num);
            num++;

        }
    }

}
