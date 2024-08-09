// Write a java code if a number prime of not.

import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        boolean isPrime = true;

        if (n == 2) {
            System.out.println("It is a Prime number");
        }
        
        else {
            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) { /// n is a multiple of i (i is not equal to 1 or n)
                    isPrime = false;
                }
            }
            // Cheking
            if (isPrime == true) {
                System.out.println("It is a Prime number");
            } else {
                System.out.println("It is not a Prime number");
            }
        }
    }
}


/*
There are composite number
1 * 4 = 4    9 * 1 = 9
2 * 2 = 4    3 * 3 = 9
4 * 1 = 4    1 * 9 = 9

1 * 6 = 6
2 * 3 = 6
3 * 2 = 6
6 * 1 = 6


prime number

1 * n = n       1 * 7 = 7
n * 1 = n       7 * 1 = 7

 */
