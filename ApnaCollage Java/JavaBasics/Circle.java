// Write a java program to input the radius and calculate the perimrter & area of a circle.
import java.util.Scanner;

public class Circle {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        double pi = 3.14;
        // float pi = 3.14f;
        System.out.print("Enter the radius = ");
        double radius = sc.nextDouble();

        double area = pi * radius * radius;
        System.out.println("Area of the circle = "+area);
        double perimeter = 2 * pi * radius;
        System.out.println("Perimeter of the circle = "+perimeter);
        sc.close();
    } 
}
