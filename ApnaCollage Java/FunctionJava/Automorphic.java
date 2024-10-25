// Write a java code to find Automorphic number

import java.util.Scanner;

public class Automorphic {

    public static boolean isAutomorphic(int num) {
        int square = num * num;
        String numStr = Integer.toString(num);
        String squareStr = Integer.toString(square);
        
        // Check if the square ends with the number
        return squareStr.endsWith(numStr);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(); // Read integer input

        if (isAutomorphic(number)) {
            System.out.println("Automorphic Number");
        } else {
            System.out.println("Not an Automorphic Number");
        }
        
        scanner.close();
    }
}















/*

import java.io.*;
import java.util.*;
class Solution {
    public void solve(Scanner sc) {
        // write your code here
        int num = sc.nextInt();
        int check = num % 10;
        int number = num * num;
        int lastdigit = number % 10;

        if (check == lastdigit){
            System.out.print("Automorphic Number");
        }
        else{
            System.out.print("Automorphic Number");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();
        solution.solve(sc);
    }
}

 */