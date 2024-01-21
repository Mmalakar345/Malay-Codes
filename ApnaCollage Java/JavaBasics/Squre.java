/*In a program, input the side of a square.You have to out put the area of the square.
(Hint : area of a square is (side x side))
 */
import java.util.Scanner;

public class Squre {
     public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side = ");
        double side = sc.nextDouble();

        double area = side * side;
        System.out.println("Area of the Squre = "+area);
        // double perimeter = 2 * pi * radius;
        // System.out.println("Perimeter of the circle = "+perimeter);
        sc.close();
     } 
}
