/*
 Conditional Problem 2
You are given a number N. Write a program using If Else such that if N is less than 30 then the
output will be "less important" otherwise the output will be "more important".

Input Format - The first line contains an integer.

Output Format - If the number is less than 30 then "less important" will be printed. 
If the number is not less than 30 then "more important" will be printed.

Example 1
Input - 30
Output
more important
Explanation - Since 30 is not less than 30 answer is "more important".

Example 2
Input - 23
Output
less important
Explanation - Since 23 is less than 30 answer is "less important".
 */

import java.util.*;

public class ConditionalProblem2 {

    public static void main(String[] args) throws java.lang.Exception {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Checking
        if (n < 30) {
            System.out.print("less important");
        } else {
            System.out.print("more important");
        }

    }
}
