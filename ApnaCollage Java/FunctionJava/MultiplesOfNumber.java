/*Instructions
List Multiples of a Number
Write a function named listMultiples that takes two numbers n and limit. 
The function should print the first n multiples of limit.
E.g., listMultiples(3, 5) should print 3, 6, 9, 12, 15
*/

public class MultiplesOfNumber {
    public static void listMultiples(int n, int limit) {
        for (int i= 1; i <= limit; i++) {
          System.out.print(n * i + "," + " ");
        }
      }
      
      public static void main(String[] args) {
      
      
        listMultiples(3,5);
      
      } 
}

