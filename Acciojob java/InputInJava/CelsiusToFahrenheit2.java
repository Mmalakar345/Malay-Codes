package InputInJava;

import java.util.*;

public class CelsiusToFahrenheit2 {

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int Celsius = sc.nextInt();

        // Celsius to fahrenheit calculating
        double Fahrenheit = ((1.8) * Celsius) + 32;
        System.out.printf("%.6f", Fahrenheit);
    }
}

/*
 * Celsius to Fahrenheit 2
 * Given a temperature in Celsius, output the fahrenheit equivalent of it.
 * Note
 * Print complete answer up to 6 decimal places.
 * To do so, you can use the System.out.printf() function in Java
 * For example,
 * float myFloat = 76.45678f;
 * System.out.printf("%.3f", myFloat);
 * %.3f is the format specifier used in System.out.printf.
 * It indicates that the value of myFloat should be printed as a floating-point
 * number with three decimal places.
 * The output is rounded to three decimal places: 76.457.
 * Input Format
 * Input consists of 1 line of a decimal number.
 * Output Format
 * Output consists of a single line of temperature in Fahrenheit.
 * EXAMPLE 1
 * Input:
 * 32
 * Output::
 * 89.600000
 * EXPLANATION:
 * To convert temperatures in degrees Celsius to Fahrenheit, multiply it by 9/5
 * or 1.8 and add 32.
 * EXAMPLE 2
 * Input:
 * 25
 * Output:
 * 77.000000
 * EXPLANATION:
 * To convert temperatures in degrees Celsius to Fahrenheit, multiply it by 9/5
 * or 1.8 and add 32.
 */