package InputInJava;

import java.util.*;

public class MathematicalOperations {
  public static void main(String[] args) throws Throwable {
    // Write code here and print output
    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();
    int sum = A + B;
    int diff = A - B;
    int prod = A * B;
    int quo = A / B;
    int rem = A % B;
    System.out.println(sum);
    System.out.println(diff);
    System.out.println(prod);
    System.out.println(quo);
    System.out.println(rem);
  }
}

/*
 * Mathematical Operations
 * You are given two positive integers. You have to calculate the result by
 * performing +,-,*,/,% operations on them.
 * Input Format
 * The first line of input contains two space-separated integers A and B.
 * Output Format
 * The first line of the output should contain the sum of A and B.
 * The second line of the output should contain the difference of A and B.
 * The third line of the output should contain the product of A and B.
 * The fourth line of the output should contain the quotient of A divided by B.
 * The fifth line of the output should contain the remainder of A modulus by B.
 * 
 * Example 1
 * Input: 8 3
 * Output:
 * 11
 * 5
 * 24
 * 2
 * 2
 * Example 2
 * Input: 10 2
 * Output:
 * 12
 * 8
 * 20
 * 5
 * 0
 */