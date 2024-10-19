// Write a java code to show product of two digits using function.

public class ProductOfDigits {
    public static int Multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 4;

        int answer = Multiply(num1, num2);
        System.out.println("Product of digit is = " + answer);

        answer = Multiply(4, 5); // pass new value and multiple time use 
        System.out.println("Product of digit is = " + answer);

        answer = Multiply(10, 5);  // pass new value and multiple time use
        System.out.println("Product of digit is = " + answer);

    }
}
