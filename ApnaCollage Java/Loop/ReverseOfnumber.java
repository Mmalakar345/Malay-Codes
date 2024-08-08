
// Write a java code to print reverse of a number using whilw looop and for loop

import java.util.Scanner;

public class ReverseOfnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int number = sc.nextInt();
        int reverse = 0;

        while (number>0) {
            reverse = number % 10;
            System.out.print(reverse);
            number = number / 10;
        }
    }
}
