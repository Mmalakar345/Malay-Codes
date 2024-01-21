// Write a java program to check a number is even or odd using ternary operator.
import java.util.Scanner;
public class TernaryOperator1 {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number which you want to check? = ");
        int number = sc.nextInt();
        
        String check = (number%2==0)? "Even Number" : "Odd Number";
        System.out.println(check);

        sc.close();;
    }
    
}
