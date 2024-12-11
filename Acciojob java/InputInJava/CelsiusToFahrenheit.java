package InputInJava;

import java.util.*;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your code here
        int tempInCelsius = sc.nextInt();

        double Fahrenheit = ((1.8) * tempInCelsius) + 32;
        int F = (int) Fahrenheit;
        System.out.print(F);

    }
}

/*
 * Celsius to Fahrenheit
 * Given the temperature of a city in Celsius (C) represented by the variable
 * tempInCelsius, your task is to convert the temperature to Fahrenheit (F) and
 * print it.
 * Formula : (C* (9/5)) + 32 = F
 * Note: It is guaranteed that the temperature in Celsius, tempInCelsius, will
 * be a multiple of 5.
 * Input Format
 * An integer tempInCelsius, represents the temperature in Celsius which is a
 * multiple of 5.
 * Output Format
 * Print an integer containing the converted temperature in Fahrenheit.
 * Example 1
 * Input
 * 25
 * Output
 * 77
 * Explanation
 * 25 * 9/5 + 32 = 77
 * Example 2
 * Input
 * -40
 * Output
 * -40
 */