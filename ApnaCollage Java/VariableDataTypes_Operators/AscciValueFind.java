package VariableDataTypes_Operators;
import java.util.Scanner;

public class AscciValueFind {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0); // Get the first character from the input
        
        int asciiValue = (int) character; // Convert character to ASCII by casting to int
        System.out.println("The ASCII value of '" + character + "' is: " + asciiValue);
        
        scanner.close();
    }
}

    

