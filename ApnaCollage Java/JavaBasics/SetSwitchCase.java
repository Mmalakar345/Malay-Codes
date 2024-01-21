// write a java program to show vplume of cylinder,Sphere, Cuboid using switch case function
import java.util.Scanner;
public class SetSwitchCase {
    public static void main(String args[]) { 
        Scanner in = new Scanner(System.in);
        System.out.println("1. Volume of cylinder");
        System.out.println("2. Volume of Sphere");
        System.out.println("3. Volume of Cuboid");
        System.out.print("Enter your choice: ");
        int choice = in.nextInt();
        
        switch(choice) {
            case 1:{
                System.out.print("Enter radius of cylinder: ");
                double rCylinder = in.nextDouble();
                System.out.print("Enter height of cylinder: ");
                double hCylinder = in.nextDouble();
                double vCylinder = (22 / 7.0) * Math.pow(rCylinder, 2) * hCylinder;
                System.out.println("Volume of cylinder = " + vCylinder);
                break;
            }
            
            case 2:{
                System.out.print("Enter radius of sphere: ");
                double r = in.nextDouble();
                double sa = (4 / 3.0) * (22 / 7.0) * Math.pow(r, 3);
                System.out.println("Volume of sphere = " + sa);
                break;
            }
                
            case 3:{
                System.out.print("Enter length of cuboid: ");
                double l = in.nextDouble();
                System.out.print("Enter breadth of cuboid: ");
                double b = in.nextDouble();
                System.out.print("Enter height of cuboid: ");
                double h = in.nextDouble();
                double vol = l * b * h;
                System.out.println("Volume of cuboid = " + vol);
                break;
                
            }
            default:{
                System.out.println("Wrong choice! Please select from 1 or 2 or 3.");
            }
            in.close();
        }
    }
}
