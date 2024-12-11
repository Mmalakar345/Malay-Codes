package InputInJava;

import java.util.*;

class Solution {
    public void solve(Scanner sc) {
        // write your code here
        int P = sc.nextInt();
        int T = sc.nextInt();
        double R = sc.nextDouble();

        // Culculate Simple Interest
        double SI = (P * T * R) / 100;
        System.out.print("Simple interest = " + SI);

    }
}

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();
        solution.solve(sc);
    }
}
