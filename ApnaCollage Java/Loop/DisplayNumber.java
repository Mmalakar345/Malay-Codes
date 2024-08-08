
// Write a java code to show display all numbers entered by user except multiple of 10
import java.util.Scanner;
import java.util.Scnner;

public class DisplayNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a number = ");
            int n = sc.nextInt();
            if(n % 10 == 0){
                continue;
            }

            System.out.println(n);

        } while (true); // it is a infinite loop
    }
}
