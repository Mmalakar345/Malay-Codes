//Write a java code to find a number Leapyear or not input by user.

import java.util.Scanner;

public class Leapyear {

    public static void LeapyearCheck(int check){
        if(check%4 == 0 && check%100!=0){
            System.out.println(check+" is a Leapyear");
        }
        else if(check%400==0){
            System.out.println(check+" is a Leapyear");
        }
        else{
            System.out.println(check+" is not a Leapyear");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a year");
        int check = sc.nextInt();

        LeapyearCheck(check);
    }
    
}
