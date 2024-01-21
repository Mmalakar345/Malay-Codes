// Write a java program to check a number is prime or not

import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 2){
            System.out.println("2 Is a prime number");
        }

        else{
            boolean isPrime = true;
            for(int i=2; i<=n-1; i++){
                if(n % i == 0){ // n is a multiple of i (i not equal to 1 or n)
                    isPrime = false;
                }
            }

            if(isPrime == true){
                System.out.println(n+" is Prime");
            }
            else{
                System.out.println(n+" is Prime");
            }
        } 
        sc.close();  
    }  
}
