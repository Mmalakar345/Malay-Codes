/*
write a java program to calculate imcome tax of a employee.
income < 5L = tax 12%.
income 5L to 10L = tax 15%.
income > 10L = tax 18%.
*/ 

import java.util.Scanner;
public class TaxCalculator{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your anual income ");
        int income = sc.nextInt();
        float tax;
        
        if (income <= 100000){
            tax = (float) (income * 0.05);
            System.out.println("Tax is = "+tax);
        }
        else if ((income > 100000) && (income <= 500000)){
            tax = (float) (income * 0.12);
            System.out.println("Tax is = "+tax);
        }
        else if ((income > 500000) && (income <= 1000000)){
            tax = (float) (income * 0.15);
            System.out.println("Tax is = "+tax);
        }
        else{
        // else if ((income > 500000) && (income <= 1000000)){
            tax = (float) (income * 0.15);
            System.out.println("Tax is = "+tax);
        }
        sc.close();
    }
}