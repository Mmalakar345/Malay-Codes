/*Enter cost of 3 items from the user (using float data type)-a pencil,a pen and an eraser. 
You have to output the total cost of the items back to the user as their bill */
import java.util.Scanner;

public class BillCalculateWithGST {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Pen = ");
        float pen = sc.nextFloat();

        System.out.println("Enter the value of Pencil = ");
        float pencil = sc.nextFloat();

        System.out.println("Enter the value of Eraser = ");
        float eraser = sc.nextFloat();
        
        float total = pen + pencil + eraser;
        System.out.println("Items amount is = "+total);
        
        float GST = (0.18f * total);
        System.out.println("GST amount is = "+GST);
        
        float  totalbill = total + (0.18f * total);
        System.out.print("Total bill amount is = "+totalbill);
        sc.close();
    }
    
}
