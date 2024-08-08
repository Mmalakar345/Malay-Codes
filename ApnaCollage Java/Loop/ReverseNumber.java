
// Write a java code to print reverse of a number using whilw looop and for loop

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int number = sc.nextInt();
        int reverse = 0;
        int lastdigit = 0;

        while (number>0) {
            lastdigit = number%10;
            reverse = ( reverse * 10 ) + lastdigit;
            number = number / 10;
        }
        System.out.print(reverse);

        // for(number=1; number; number++){
        //     lastdigit = number%10;
        //     reverse = ( reverse * 10 ) + lastdigit;
        //     number = number / 10;
        // }
        // System.out.print(reverse);
    
    }
}
