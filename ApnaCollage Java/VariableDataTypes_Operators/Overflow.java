package VariableDataTypes_Operators;

public class Overflow {

    public static void main(String[] args) {
        int minimum = Integer.MIN_VALUE - 1; 
        System.out.println("Minimum value of int datatype = "+minimum);
        // this line return to the maximum +2147483647
        
        int maximum = Integer.MAX_VALUE + 1; 
        System.out.println("Maximum value of int datatype = " +maximum);
        // this line return to the minimum -2147483648
        // because of range

        // same as long data type
        long maximum1 = Long.MAX_VALUE + 1; 
        System.out.println("Maximum value of long datatype = " +maximum1);
        // this line return to the minimum -9223372036854775808

        // short datatype not overflow
        short number2 = Short.MAX_VALUE - 5;
        System.out.println(""+number2);
        short number3 = Short.MIN_VALUE ;
        System.out.println(number3);
    }
    
}
