// Write a java program keep entering number still user enters a multiple of 10

import java.util.Scanner;

public class UserChoice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Enter the number ");
            n = sc.nextInt();

            if(n % 10 ==0){
                break;
            }
            System.out.println("Still the number "+n+" is not a multiple of 10");
        } while(true);
        System.out.println("The number "+n+" is a multiple of 10");
        sc.close();
    }
}