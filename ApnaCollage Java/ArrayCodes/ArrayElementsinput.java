// write a java code to show how to input value in a array and basic functionalities of an array.
package ArrayCodes;

import java.util.*;
public class ArrayElementsinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[100];

        System.err.println("Enter Physics number = ");
        marks[0] = sc.nextInt();
        System.err.println("Enter Chemistry number = ");
        marks[1] = sc.nextInt();
        System.err.println("Enter Mathematics number = ");
        marks[2] = sc.nextInt();
        
        
        System.err.println("1. Physics number is = "+marks[0]);
        System.err.println("2. Chemistry number is = "+marks[1]);
        System.err.println("3. Mathematics number is = "+marks[2]);
        
        
        // Update phy number
        marks[0]=99;
        System.err.println("4. Update Physics number is = "+marks[0]);
        
        // Update matha number
        marks[2] = marks[2] + 1;
        System.err.println("5. Update Mathematics number is = "+marks[2]);
        
        //Array Length
        System.err.println("6. Array marks length is = "+marks.length);
    }
    
}
