/*
Conditional Problem 1
Given an integer n. Your task is to write a program to use switch case as follows :
if the input number is 28, print i am young.
else print i am not young.
Input Format
First line contains an integer n.
Output Format
Print the statement based on value of n as given above.

Example 1
Input 28

Output
i am young

Example 2
Input 30
Output
i am not young
*/

import java.util.*;

public class ConditionalProblem4 {

    public static void main(String[] args) {
        // write code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Checking
        if (n == 28) {
            System.out.print("i am young");
        } else {
            System.out.print("i am not young");
        }

    }
}
