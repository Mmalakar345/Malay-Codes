// Write a java code to keep entering numbers till user enter the multiple of 10.
import java.util.Scanner;

public class keepBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter a number = ");
            int n = sc.nextInt();
            if(n % 10 == 0){
                break;
            }
            System.out.println(n);
        } while (true);
        System.out.println("Entered number is multiple of 10");
        sc.close();
    }

}
