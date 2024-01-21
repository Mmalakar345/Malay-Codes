/*Enter cost of 3 items from the user (using float data type)-a pencil,a pen and an eraser. 
You have to output the total cost of the items back to the user as their bill */
import java.util.Scanner;

public class BillCalculate {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Pen = ");
        float pen = sc.nextFloat();

        System.out.println("Enter the value of Pencil = ");
        float pencil = sc.nextFloat();

        System.out.println("Enter the value of Eraser = ");
        float eraser = sc.nextFloat();
        
        float total = pen + pencil + eraser;
        System.out.print("Total amount is = "+total);

        sc.close();
    }
    
}
