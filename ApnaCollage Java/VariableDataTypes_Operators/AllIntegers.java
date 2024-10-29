package VariableDataTypes_Operators;

public class AllIntegers {

    public static void main(String[] args) {
        // Four Types integer = byte - short - int - long

        // Byte
        byte age = -128; // byte min_max range -128 to +127
        // byte age = -129; // range over so this line get an error
        System.out.println("byte datatype minimum value => " + age);

        byte age2 = 127; // byte min_max range -128 to +127
        // byte age2 = 128; // range over so this line get an error
        System.out.println("byte datatype max value => " + age2);


        
        // short
        short weight = -32768; // short min-max range -32768 to +32767
        // short weight = -32769; // range over so this line get an error
        System.out.println("short datatype minimum value => " + weight);

        short weight2 = 32767; // short min-max range -128 to +127
        // short weight2 = 32768; // range over so this line get an error
        System.out.println("short datatype max value => " + weight2);



        // int
        int number = Integer.MIN_VALUE; // int min_max range -2147483648 to +2147483647
        // int number = -2147483649; // range over so this line get an error
        System.out.println("int datatype minimum value => " + number);

        int number2 = Integer.MAX_VALUE; // int min_max range -2147483648 to +2147483647
        // int number2 = 2147483648; // range over so this line get an error
        System.out.println("int datatype max value => " + number2);
        // Integer.MAX_VALUE --- int datatype maximum value find inbuilt function
        // Integer.MIN_VALUE --- int datatype minimum value find inbuilt function



        // long
        long phNum = Long.MIN_VALUE; // long min_max range -9223372036854775808 to +9223372036854775807
        // long phNum = -9223372036854775809; // range over so this line get an error
        System.out.println("byte datatype minimum value => " + phNum);

        long phNum2 = Long.MAX_VALUE; // long min_max range -9223372036854775808 to +9223372036854775807
        // long phNum2 = 9223372036854775808; // range over so this line get an error
        System.out.println("byte datatype max value => " + phNum2);
        // Long.MAX_VALUE --- int datatype maximum value find inbuilt function
        // Long.MIN_VALUE --- int datatype minimum value find inbuilt function

    }

}
