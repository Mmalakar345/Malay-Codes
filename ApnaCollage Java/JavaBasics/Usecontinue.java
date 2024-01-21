// Write a java program Display all numbers entered by user except multiples of 10

import java.util.Scanner;

public class Usecontinue{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.println("Enter the number --- Press 69 to exit");
            num = sc.nextInt();

            if(num % 10 ==0){
                continue;
            }
            if(num==69){
                break;
            }
            System.out.println("Still the number "+num+" is not a multiple of 10");
        } while(true);
       sc.close(); 
    }
}